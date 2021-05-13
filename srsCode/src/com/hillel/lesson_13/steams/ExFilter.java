package com.hillel.lesson_13.steams;

import com.hillel.lesson_13.streamExample.businessObject.User;
import com.hillel.lesson_13.streamExample.businessObject.enumerators.Sex;
import com.hillel.lesson_13.streamExample.businessObject.service.UserService;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ExFilter {
    public static void main(String[] args) {

        List<User>  users = UserService.getUserList();
        users.forEach(User::print);
        System.out.println("---------");
        System.out.println(users.stream().filter(u -> u.getSex().equals(Sex.FEMALE)).count());
        List<User>  fUsers = users.stream().filter(u -> u.getSex().equals(Sex.FEMALE)).collect(Collectors.toList());
        System.out.println("---------");
        fUsers.forEach(User::print);

        Predicate<User> isMale = (u) -> u.getSex().equals(Sex.MALE);
        Predicate<User> isAdult = (u) -> u.getAge() > 18;
        System.out.println("---------");
        List<User>  mUsers = users.stream().filter(isMale.and(isAdult)).collect(Collectors.toList());
        mUsers.forEach(User::print);

    }
}
