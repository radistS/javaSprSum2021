package com.hillel.lesson_07;


import com.hillel.lesson_07.enumer.User;
import com.hillel.lesson_07.enumer.UserStatus;

public class Main {
    public static void main(String[] args) {
        User user = new User("test@test.com");
        System.out.println(user.toString());
        user.setStatus(UserStatus.ACTIVE);
        System.out.println(user.toString());

    }
}
