package com.hillel.lesson_10.ex;

public class Bonus {
    public static void main(String[] args) {
        Object o1 = new Object();
        Object o2 = new Object();

        System.out.println(o1 == o2);
        System.out.println(o1.equals(o2));

        System.out.println(o1);
        System.out.println(o2);
    }
}
