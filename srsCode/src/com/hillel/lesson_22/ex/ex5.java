package com.hillel.lesson_22.ex;

public class ex5 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("TOMATO");
        System.out.println(sb.reverse().toString()
                .replace('O', 'A'));

        System.out.println(sb);
        System.out.println(sb.reverse().replace(0,3, "a")); // aATO

    }
}
