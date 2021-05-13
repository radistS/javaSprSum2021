package com.hillel.lesson_14.java8;

import java.util.List;

public class MetReff {
    public static void main(String[] args) {
        List<UserTest> testList = List.of(
                new UserTest("Alex", 10),
                new UserTest("Ivan", 11),
                new UserTest("Fedor", 12),
                new UserTest("Kesha", 13)
        );

        testList.forEach(UserTest::print);

    }
}


class UserTest {
    private String name;
    private Integer age;

    public UserTest(String name) {
        this.name = name;
    }

    public UserTest(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void print(){
        System.out.println(name + " " + age);
    }
}
