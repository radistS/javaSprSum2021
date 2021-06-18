package com.hillel.lesson_24.immutable;

import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        ImmutableStudent immutableStudent = new ImmutableStudent("Ivan", "Ivanov", 23);

        System.out.println(immutableStudent);
        System.out.println(immutableStudent.getLastName());
        System.out.println(immutableStudent.getFirstName());
        System.out.println(immutableStudent.getAge());


        String fName = immutableStudent.getFirstName();

        Class fn = fName.getClass();
        Field field = fn.getDeclaredField("value");
        field.setAccessible(true);
        field.set(fName, "WTF".getBytes());
        System.out.println(field.get(fName));

    }



}
