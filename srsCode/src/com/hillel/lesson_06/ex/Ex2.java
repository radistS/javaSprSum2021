package com.hillel.lesson_06.ex;

public class Ex2 {
    public static void main(String[] args) {
        int x = 0;
        while (x++ < 10){

        }
        String message = x > 10 ? "Grather than" : String.valueOf(false);
        System.out.println(message+","+x);
    }
}
