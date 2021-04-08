package com.hillel.lesson_07.HW.utils;

import com.hillel.lesson_07.HW.dto.User;

public class UserGenerator {
    public static User[] generateUser(){
        User[] users = new User[5];

        users[0] = new User(1, "user1", "pass1", "email1");
        users[1] = new User(2, "user2", "pass1", "email2");
        users[2] = new User(3, "user3", "pass1", "email3");
        users[3] = new User(4, "user4", "pass1", "email4");
        users[4] = new User(5, "user5", "pass1", "email5");

        return users;
    }

}
