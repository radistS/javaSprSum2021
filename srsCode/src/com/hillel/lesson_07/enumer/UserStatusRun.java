package com.hillel.lesson_07.enumer;

public class UserStatusRun {
    public static void main(String[] args) {
        User u = new User("test@email.com");

        System.out.println(u);

        u.setStatus(UserStatus.ACTIVE);

        System.out.println(u);

        u.setStatus(UserStatus.UNDEFINED);

        System.out.println(u);
    }
}
