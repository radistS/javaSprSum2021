package com.hillel.lesson_13.comp;

import com.hillel.lesson_13.streamExample.businessObject.User;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ComporatorExample {
    public static void main(String[] args) {
        List<User> userList = new ArrayList<>();

        userList.add(new User("Ivan"));
        userList.add(new User("Sveta"));
        userList.add(new User("Anna", "",34));
        userList.add(new User("Alex", "1",12));
        userList.add(new User("Alex", "2",43));
        userList.add(new User("Alex", "3",34));
        userList.add(new User("Petr", "",44));

        Comparator<User> userComparator = new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                return o1.getFirstName().compareTo(o2.getFirstName());
            }
        };

        Comparator<User> ageComparator = (o1, o2) -> o1.getAge().compareTo(o2.getAge());

        userList.forEach(System.out::println);
        System.out.println();
        userList.sort(userComparator.reversed().thenComparing(ageComparator.reversed()));

        userList.forEach(System.out::println);

        userList.sort((User u1, User u2) -> u1.getAge().compareTo(u2.getAge()));
        userList.sort(Comparator.comparing(User::getAge));
    }
}


