package com.hillel.lesson_16.gc;

public class GCnative {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("=== START ===");
        int i = 0;

        while (true) {
            System.out.println("create user >>  " + i);
            new Person("User " + i++);
//            Thread.sleep(1);
        }

    }
}
