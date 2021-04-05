package com.hillel.lesson_06.ex;

public class Ex4 {
    public static void main(String[] args) {
        Integer i = 0;
        for (i = 0; i < 10; ) {
//            i = i++;
//            i++;
            i = ++i;
            System.out.println("i = " +  i);
//            i = ++i;
//            System.out.println("Hello World");
        }
    }
}
