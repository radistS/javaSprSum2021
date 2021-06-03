package com.hillel.lesson_20.ex;

public class ex5 {
    public static void main(String[] args) {
        int m = 20;
        int result = --m * m++ + m-- - --m;

        System.out.println(19 * 19 + 20 - 18);
        System.out.println("m = " + m);
        System.out.println("result = " + result);
    }
}
