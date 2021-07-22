package com.bank.echange.service;

import com.bank.echange.dto.WalletDto;
import com.bank.echange.entity.CurrencyEnum;
import com.bank.echange.entity.Rate;
import com.bank.echange.mapper.MapperConfig;
import com.bank.echange.repositori.RateRepository;
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
public class ExchangeService {

    private final RateRepository rateRepository;

    private final MapperConfig mapperConfig;

    @Scheduled(cron = "0 * * * * *")
    public void getRates() throws JsonProcessingException {
        log.error("start cron job");
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
        log.error("finish cron job");
    }


}
