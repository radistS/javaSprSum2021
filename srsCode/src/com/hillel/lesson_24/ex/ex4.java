package com.hillel.lesson_24.ex;

public class ex4 {
    public static void main(String[] args) {
        final int i1 = 1;
        final Integer i2 = 1;
        final String s1 = ":ONE";
        final String s2 = ":ONE";
        String str1 = i1 + s1;
        String str2 = i2 + s1;
        String str3 = s1 + s2;

        System.out.println(str1 == "1:ONE");
        System.out.println(str2 == "1:ONE");

        System.out.println(str3 == "ONE:ONE");
        System.out.println(str3 == new String("ONE:ONE").intern());
        System.out.println(str3 == new String("ONE:ONE"));
    }
}
