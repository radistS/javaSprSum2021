package com.hillel.lesson_08.ex;

public class Ex5 {
    private final static String RESULT ="2cfalse";
    public static void main(String[] args) {
        String a = "";
        a += 2;
        System.out.println(a);
        a += 'c';
        System.out.println(a);
        a += false;
        System.out.println(a);
        if (a == RESULT) System.out.println("==");
        if (a.equals(RESULT)) System.out.println("equals");
    }
}
