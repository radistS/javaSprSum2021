package com.hillel.lesson_17.ex;

public class Ex3 {
    public static void main(String[] args) {
        int x = 7;


//        boolean res = x++ == 7 && ++x == 9 || x++ ==  9;
        boolean res = x++ == 7 & ++x == 9 | x++ == 9;

        System.out.println("x = " + x);
        System.out.println("res = " + res);
    }
}
