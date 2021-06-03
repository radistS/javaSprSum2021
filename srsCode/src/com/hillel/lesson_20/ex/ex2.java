package com.hillel.lesson_20.ex;

public class ex2 {
    public static void main(String[] args) {
        StringBuilder sb =
                new StringBuilder("Breathe Deeply");
//        String str1 = sb.toString().intern();
        String str1 = sb.toString();    // Heap
        String str2 = "Breathe Deeply"; // StringPool
//        String str3 = "Breathe Deeply";

        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));
//        System.out.println(str2 == str3);
    }
}
