package com.hillel.lesson_07.HW.service.impl;

import com.hillel.lesson_07.HW.dto.User;
import com.hillel.lesson_07.HW.service.UserService;

public class UserServiceImpl implements UserService {

    @Override
    public void print(User[] users) {
        for (User u : users) System.out.println(u);
    }
}
