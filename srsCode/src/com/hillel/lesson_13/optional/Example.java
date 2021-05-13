package com.hillel.lesson_13.optional;

import com.hillel.lesson_13.streamExample.businessObject.User;

import java.util.Optional;

public class Example {
    public static void main(String[] args) {
        User user = new User();
//        User user = null;
        System.out.println("--- 1 ---");
        User opt1 = Optional.ofNullable(user).orElse(new User()); // null -> new User
        System.out.println(user);
        System.out.println("--- 2 ---");
        A a = new A();
        User opt2 = Optional.ofNullable(user).orElseGet(A::print); // null -> run method
        System.out.println("--- 3 ---");
        User opt3 = Optional.ofNullable(user).orElseThrow(() -> new RuntimeException()); // null -> ecxeption

        Optional<User> opt = Optional.of(user);

        if (opt.isPresent()){
            System.out.println(opt.map(o -> {
                o.setAge(16);
                o.setFirstName("name");
                return o;
            }));
        }

    }

    public static User  print(){
        System.out.println("test message");
        return new User();
    }
}

class A {
    public static User  print(){
        System.out.println("test message from class A");
        return new User();
    }
}
