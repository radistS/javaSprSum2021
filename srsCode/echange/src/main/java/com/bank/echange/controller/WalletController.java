package com.bank.echange.controller;

import com.bank.echange.dto.WalletDto;
import com.bank.echange.dto.WalletUpdateDto;
import com.bank.echange.entity.Notification;
import com.bank.echange.entity.TypeEnum;
import com.bank.echange.entity.Wallet;
import com.bank.echange.exceptions.NotEnoughtMoneyException;
import com.bank.echange.mapper.MapperConfig;
import com.bank.echange.repository.NotificationRepository;
import com.bank.echange.repository.WalletRepository;
import com.bank.echange.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Timestamp;
import java.util.List;

/**
 * @version 0.0.1
 */
@RestController
@RequestMapping("/api/v1/wallet")
@RequiredArgsConstructor
@Slf4j
public class WalletController {

    private final UserService userService;
    private final WalletRepository walletRepository;
    private final MapperConfig mapperConfig;
    private final NotificationRepository notificationRepository;

    @PostMapping
    public WalletDto updateWallet(@RequestBody WalletUpdateDto wallet)  {
        if (userService.isUserNotExist(wallet.getPhone())){
            throw new RuntimeException("Unsupported operation. User is not register in system.");
        }

        Wallet wal = walletRepository.findAllByCurrencyAndUser_Phone(wallet.getCurrency(), wallet.getPhone());

        wal.setAmmount(wal.getAmmount().add(wallet.getAmmount()))
                .setLastModify(new Timestamp(System.currentTimeMillis()));

        wal = walletRepository.save(wal);

        notificationRepository.save(
                new Notification()
                    .setType(TypeEnum.EXCHANGE)
                    .setContent(String.format("Add to account by phone number : %s %s %s",
                            wallet.getPhone(),
                            wallet.getAmmount(),
                            wallet.getCurrency()))
                    .setUserId(wal.getUser().getId())
        );

        return mapperConfig.map(wal, WalletDto.class);
    }

    @PutMapping("/get")
    public WalletDto getMoneyFromWallet(@RequestBody WalletUpdateDto wallet)  {
        if (userService.isUserNotExist(wallet.getPhone())){
            throw new RuntimeException("Unsupported operation. User is not register in system.");
        }

        Wallet wal = walletRepository.findAllByCurrencyAndUser_Phone(wallet.getCurrency(), wallet.getPhone());

        if (wal.getAmmount().compareTo(wallet.getAmmount()) == -1)
            throw new NotEnoughtMoneyException("Not enough money fot take...");

        wal.setAmmount(wal.getAmmount().subtract(wallet.getAmmount()))
                .setLastModify(new Timestamp(System.currentTimeMillis()));

        wal = walletRepository.save(wal);

        return mapperConfig.map(wal, WalletDto.class);
    }



    @GetMapping
    List<WalletDto> getWalletsByUserPhone(@RequestParam String phone){
        return mapperConfig.mapAsList(walletRepository.findAllByUser_Phone(phone), WalletDto.class);
    }

}
