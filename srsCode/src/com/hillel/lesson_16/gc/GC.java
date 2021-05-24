package com.hillel.lesson_16.gc;

import java.util.Objects;

public class GC {

    public static void main(String[] args) {
        System.out.println("=== START ===");
        Person person = new Person("User 1");
        Person person1 = new Person("User 2");

        person = null;

        System.gc();

        System.out.println(Objects.nonNull(person));
        System.out.println(Objects.nonNull(person1));

        System.out.println("=== FINISH ==");
    }
}
