package com.bank.echange.service;

import com.bank.echange.dto.UserDto;
import com.bank.echange.entity.User;
import org.springframework.stereotype.Service;

@Service
public interface UserService {

    UserDto createUser(UserDto user);

    User getUserByPhone(String phone);

    boolean isUserNotExist(String phone);

}
