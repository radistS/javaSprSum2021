package com.hillel.lesson_16.gc;

public class GCRun {
    public static void main(String[] args) {

        int i = 0;

        while (true) {
            System.out.println("create user >>  " + i);
            new Person("User " + i++);
        }

    }
}
