package com.hillel.lesson_12.validator;

import com.hillel.lesson_03.p2.Run;

public class Main {
    public static void main(String[] args) {

        try {
            new UserValidator().validate(new
                    User("Alex", "St@mail.com", 18, "+380505673214"));
        } catch (AgeException | EmailException | PhoneValidationException ex) {
            System.out.println(ex.getMessage());
        }


        try {
            new UserValidator().valid(new
                    User("Alex", "Stmail.com", 8, "+80505673214"));
        } catch (RuntimeException ex) {
            System.out.println(ex.getMessage());
        }


        new UserValidator().validate(new
                User("Alex", "Stmail.com", 18, "+380505673214"));

    }
}
