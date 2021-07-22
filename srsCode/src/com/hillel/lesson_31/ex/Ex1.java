package com.hillel.lesson_31.ex;

public class Ex1 {
    public static void main(String[] args) {
        System.out.println(div(4, 0));
    }

    static int div(int a, int b) {
        try {
            return a / b;
        } catch (RuntimeException rex) {
            return -1;
//        } catch (ArithmeticException aex) {
//            return 0;
        } finally {
            System.out.println("DONE");
//            return -2;
        }
    }
}