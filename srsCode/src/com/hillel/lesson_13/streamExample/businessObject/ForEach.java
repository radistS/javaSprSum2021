package com.hillel.lesson_13.streamExample.businessObject;

import com.hillel.lesson_13.streamExample.businessObject.enumerators.Sex;
import com.hillel.lesson_13.streamExample.businessObject.service.UserService;

import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class ForEach {
    public static void main(String[] args) {
//        UserService.getUserList().forEach(System.out::println);

        Predicate<User> isAdult = (u) -> u.getAge() > 30;
        Predicate<User> isMale = (u) -> u.getSex().equals(Sex.MALE);
        List<User> userList = UserService.getUserList();
//
//        UserService.getUserList()
//                .stream()
//                .filter(isAdult.and(isMale))
//                .forEach(System.out::println);
//
//
//        System.out.println();
//        UserService.getUserList().stream().filter(u -> u.getAge() > 30 && u.getSex().equals(Sex.MALE)).forEach(user -> System.out.println(user.toString()));
//        System.out.println();
////        userList = userList.stream().filter(isAdult.and(isMale)).collect(Collectors.toList());
////        userList.forEach(System.out::println);
////        System.out.println(userList);


//        UserService.getUserList().stream().skip(5).filter(isMale).forEach(System.out::println);
//        System.out.println();
//        UserService.getUserList().stream().limit(5).filter(isMale).forEach(System.out::println);

        Comparator<User> userComparator = new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                return o1.getFirstName().compareTo(o2.getFirstName());
            }
        };

        UserService.getUserList().stream().sorted(userComparator).forEach(System.out::println);



    }
}
