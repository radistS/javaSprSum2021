package com.hillel.lesson_13;

public class test {
    public static void main(String[] args) {
        Double a = 1_000_000d;
        Double b = 1_000_000d;
        Double c = 1_000_000d;

        System.out.println(a);
        System.out.println((a + b + c) / 3 );

        System.out.println(a + b - c == (a + b) / 2 );

    }
}
