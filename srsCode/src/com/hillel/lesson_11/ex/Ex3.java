package com.hillel.lesson_11.ex;

public class Ex3 {
    public static void main(String[] args) {
        String s = "JAVA";
        System.out.println(s);
        s = s + "rock";
        System.out.println(s);
        System.out.println(s.length());
        s = s.substring(4, 8);
        s.toUpperCase();
        System.out.println(s);
    }
}
