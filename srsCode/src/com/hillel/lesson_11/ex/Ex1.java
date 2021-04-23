package com.hillel.lesson_11.ex;

public class Ex1 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("abc");
        String s = "abc";
        sb.reverse().append("d");
        s.toUpperCase().concat("d");
        System.out.println("." + sb + ". ." + s + ".");
    }
}
