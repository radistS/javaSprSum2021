package com.bank.echange.service.impl;

import com.bank.echange.dto.UserDto;
import com.bank.echange.entity.CurrencyEnum;
import com.bank.echange.entity.User;
import com.bank.echange.entity.Wallet;
import com.bank.echange.exceptions.UserNotFoundException;
import com.bank.echange.exceptions.UserNotUniqueException;
import com.bank.echange.mapper.MapperConfig;
import com.bank.echange.repository.UserRepository;
import com.bank.echange.repository.WalletRepository;
import com.bank.echange.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.sql.Timestamp;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private static final String USER_NOT_FOUND = "User with id = %s not found";
    private static final String NOT_UNIQUE_USER = "User with with this phone number already exist";

    private final UserRepository userRepository;
    private final MapperConfig mapperConfig;
    private final WalletRepository walletRepository;

    public UserDto createUser(UserDto user){
        isUserExist(user.getPhone());

        User u = userRepository.save(mapperConfig.map(user, User.class));

        Wallet wUSD = new Wallet()
                .setCurrency(CurrencyEnum.USD)
                .setUser(u)
                .setAmmount(BigDecimal.ZERO)
                .setLastModify(new Timestamp(System.currentTimeMillis()));

        Wallet wUAH = new Wallet()
                .setCurrency(CurrencyEnum.UAH)
                .setUser(u)
                .setAmmount(BigDecimal.ZERO)
                .setLastModify(new Timestamp(System.currentTimeMillis()));


        walletRepository.save(wUAH);
        walletRepository.save(wUSD);

        return mapperConfig.map(u, UserDto.class);
   }

   public User getUserByPhone(String phone) {
        return userRepository.findByPhone(phone).orElseThrow(() -> new UserNotFoundException("User not found"));
   }

   public boolean isUserNotExist(String phone){
       return userRepository.findByPhone(phone).isEmpty();
   }

   private void isUserExist(String phone){
       if (userRepository.findByPhone(phone).isPresent()){
           throw new UserNotUniqueException(NOT_UNIQUE_USER);
       }
   }
}
