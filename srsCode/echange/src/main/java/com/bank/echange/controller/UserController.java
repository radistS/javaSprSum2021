package com.bank.echange.controller;

import com.bank.echange.exceptions.UserNotFoundException;
import com.bank.echange.dto.UserDto;
import com.bank.echange.entity.User;
import com.bank.echange.mapper.MapperConfig;
import com.bank.echange.repository.UserRepository;
import com.bank.echange.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @version 0.0.1
 */
@RestController
@RequestMapping("/api/v1/user")
@RequiredArgsConstructor
@Slf4j
public class UserController {

    private static final String USER_NOT_FOUND = "User with id = %s not found";
    private static final String NOT_UNIQUE_USER = "User with with this phone number already exist";

    private final UserRepository userRepository;
    private final MapperConfig mapperConfig;
    private final UserService userService;

    @PostMapping
    public Long createUser(@RequestBody UserDto user)  {
        return userService.createUser(user).getId();
    }

    @GetMapping("/{id}")
    public UserDto user(@PathVariable Long id){
         User user = userRepository.findById(id)
                 .orElseThrow(() -> new UserNotFoundException(String.format(USER_NOT_FOUND, id)));

        return mapperConfig.map(user, UserDto.class);
    }

    @GetMapping
    public List<UserDto> users(){
        return userRepository.findAll() // get all users from DB
                .stream().map(u-> mapperConfig.map(u, UserDto.class)) // convert User -> UserDto
                .collect(Collectors.toList());
    }


}
