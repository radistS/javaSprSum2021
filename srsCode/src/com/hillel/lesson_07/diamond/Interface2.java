package com.hillel.lesson_07.diamond;

public interface Interface2 {
    default void print() {
        System.out.println("Interface 2");
    }

    default void print2() {
        System.out.println("I2.print()");
    }
//
//    void print1();
//
//    void print3(String str);
}
