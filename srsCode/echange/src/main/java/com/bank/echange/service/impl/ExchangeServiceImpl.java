package com.bank.echange.service.impl;

import com.bank.echange.dto.WalletDto;
import com.bank.echange.dto.WalletUpdateDto;
import com.bank.echange.entity.CurrencyEnum;
import com.bank.echange.entity.Notification;
import com.bank.echange.entity.Rate;
import com.bank.echange.entity.TypeEnum;
import com.bank.echange.entity.Wallet;
import com.bank.echange.mapper.MapperConfig;
import com.bank.echange.repository.NotificationRepository;
import com.bank.echange.repository.RateRepository;
import com.bank.echange.repository.WalletRepository;
import com.bank.echange.service.ExchangeService;
import com.bank.echange.service.UserService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class ExchangeServiceImpl implements ExchangeService {

    private final RateRepository rateRepository;
    private final UserService userService;
    private final WalletRepository walletRepository;
    private final MapperConfig mapperConfig;
    private final NotificationRepository notificationRepository;

    @Scheduled(cron = "5 * * * * *")
    public void getRates() throws JsonProcessingException {
        log.info("start cron job");
        RestTemplate restTemplate = new RestTemplate();
        String fooResourceUrl
                = "https://api.privatbank.ua/p24api/pubinfo?json&exchange&coursid=5";
        ResponseEntity<String> response
                = restTemplate.getForEntity(fooResourceUrl, String.class);
        log.error(response.getBody());

        ObjectMapper mapper = new ObjectMapper();
        JsonNode actualObj = mapper.readTree(response.getBody());

        actualObj.forEach(c -> {
            if (!c.get("ccy").asText().equals("BTC") && !c.get("ccy").asText().equals("RUR")) {
                Rate rate = new Rate()
                        .setBuy(BigDecimal.valueOf(Double.parseDouble(c.get("buy").asText())))
                        .setSale(BigDecimal.valueOf(Double.parseDouble(c.get("sale").asText())))
                        .setReceive(new Timestamp(System.currentTimeMillis()))
                        .setCurrency(CurrencyEnum.valueOf(c.get("ccy").asText()));
                rateRepository.save(rate);
            }
        });

        notificationRepository.save(
                new Notification()
                        .setType(TypeEnum.RATE)
                        .setContent(String.format("Update rate at %s", new Timestamp(System.currentTimeMillis()))));
        log.info("finish cron job");
    }

    public List<WalletDto> exchange(WalletUpdateDto upd){
//        if (userService.isUserNotExist(upd.getPhone())){
//            throw new RuntimeException("Unsupported operation. User is not register in system.");
//        }

        List<Wallet> wallets = walletRepository.findAllByUser_Phone(upd.getPhone());

        Wallet wUSD = null;
        Wallet wUAH = null;

        for (Wallet w : wallets){
            if (w.getCurrency().equals(CurrencyEnum.UAH)){
                wUAH = w;
            } else {
                wUSD = w;
            }
        }

        List<Rate> allByCurrency = rateRepository.findAllByCurrency(upd.getCurrency());

        BigDecimal rate = allByCurrency.get(allByCurrency.size() - 1).getBuy();

        if (upd.getCurrency().equals(CurrencyEnum.USD)){
            BigDecimal uahAmmount = rate.multiply(upd.getAmmount());

            wUSD.setAmmount(wUSD.getAmmount().add(upd.getAmmount()));
            wUAH.setAmmount(wUAH.getAmmount().subtract(uahAmmount));
        }

        walletRepository.save(wUSD);
        walletRepository.save(wUAH);

        return mapperConfig.mapAsList(walletRepository.findAllByUser_Phone(upd.getPhone()), WalletDto.class);
    }
}
