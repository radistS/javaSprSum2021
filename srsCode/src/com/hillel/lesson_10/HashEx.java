package com.hillel.lesson_10;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

public class HashEx {
    public static void main(String[] args) throws InterruptedException {

        User user1 = new User("Alex", "23");
        Thread.sleep(1234);
        User user2 = new User("Alex", "23");

        Set<User> users = new HashSet<>();

        System.out.println(user1);
        System.out.println(user2);

        users.add(user1);
        users.add(user2);

        System.out.println(users);
    }
}

class User{
    String name;
    String age;
    Long timeStamp;

    public User(String name, String age) {
        this.name = name;
        this.age = age;
        this.timeStamp = System.currentTimeMillis();
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", timeStamp=" + timeStamp +
                '}';
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(name, user.name) &&
                Objects.equals(age, user.age);
    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(name, age);
//    }
}


