package com.hillel.lesson_13.optional;


import com.hillel.lesson_13.streamExample.businessObject.User;
import com.hillel.lesson_13.streamExample.businessObject.enumerators.Sex;

import java.util.Optional;

public class OptExampe {
    public static void main(String[] args) {
        User user = new User();
        user.setId(1);
        user.setFirstName("Ivan");
        user.setLastName("Ivanov");
        user.setAge(18);
        user.setSex(Sex.MALE);

        User user1 = null;

       Optional<User> us = Optional.ofNullable(user1);

        System.out.println(us.isPresent());

        Optional<User> userOptional = Optional.ofNullable(user);

        userOptional.ifPresent(User::getFirstName);

        if (userOptional.isPresent()){
            System.out.println(userOptional.get().getAge());
        }


////        Optional<User> userOptional = Optional.ofNullable(null);
//
//        String name = userOptional.map(u -> u.getFirstName() + " " + u.getLastName()).orElse("error");
//
//        System.out.println(name);
//
//        User isAdult =  userOptional.filter(u -> u.getAge() > 18).orElseThrow(AgeException::new);
//
//        boolean adult;
//        if (userOptional.get().getAge() > 18) {
//            adult = true;
//        } else {
//            throw new AgeException();
//        }
//
//        System.out.println(adult);
//        System.out.println(isAdult);
    }
}
