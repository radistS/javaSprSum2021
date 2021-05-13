package com.hillel.lesson_13.streamExample.businessObject.service;

import com.hillel.lesson_13.streamExample.businessObject.User;
import com.hillel.lesson_13.streamExample.businessObject.enumerators.Sex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UserService {

    public static List<User> getUserList() {
        return new ArrayList<>(Arrays.asList(
                new User(1, "Ivan", "Ivanov", 4, Sex.MALE),
                new User(2, "Oksana", "Mukha", 5, Sex.FEMALE),
                new User(3, "Petr", "Smolov", 6, Sex.MALE),
                new User(4, "Inna", "Gusta", 18, Sex.FEMALE),
                new User(5, "Anton", "Chehov", 28, Sex.MALE),
                new User(6, "Sidr", "Sidorov", 30, Sex.MALE),
                new User(7, "Pauline", "Parmentier", 33, Sex.FEMALE),
                new User(8, "Novak", "Djokovic", 8, Sex.MALE),
                new User(9, "Elina", "Svitolina", 20, Sex.FEMALE),
                new User(10, "Matteo", "Berrettini", 34, Sex.MALE),
                new User(11, "John", "Tasnim ", 30, Sex.MALE),
                new User(12, "Serena", "Lowery", 15, Sex.FEMALE),
                new User(13, "Hanson", "Kairo ", 66, Sex.MALE),
                new User(14, "Jonas", "Lindsey", 39, Sex.MALE),
                new User(15, "Cassandra", "Richardson", 45, Sex.FEMALE)
        ));
    }
}
