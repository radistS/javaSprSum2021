package com.hillel.lesson_20;

public class Main {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().isAlive());
        System.out.println(Thread.currentThread().getId());
        System.out.println(Thread.currentThread().getPriority());

    }
}
