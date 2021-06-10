package com.hillel.lesson_22.ex;

public class ex2 {
    public static void main(String[] args) {
        try {
            foo();
        } catch (Exception ex) {
            System.out.println("exMain");
            ex.printStackTrace();
        }
    }

    public static void foo() {
        try {
            throw new IllegalArgumentException("catch");
        } finally {
            try {
                throw new RuntimeException("finally");
            } catch (IllegalArgumentException ex) {
                System.out.println("exFoo");
                ex.printStackTrace();
            }
        }
    }
}
