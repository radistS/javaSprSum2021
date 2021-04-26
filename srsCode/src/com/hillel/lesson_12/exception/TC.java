package com.hillel.lesson_12.exception;

public class TC {
    public static void main(String[] args) {
        try {
            System.out.println("1");
//            if (true)
            if (false)
                throw new RuntimeException();
            System.out.println("2");
        } catch (RuntimeException ex) {
            System.err.println("3");
        }
        System.out.println("4");
    }
}
