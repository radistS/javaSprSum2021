package com.hillel.lesson_26.ex;

public class Test3 {
    public static void main(String[] args) {
        int i = 0;
        int j = 9;
        do {
            i++;
            if (j-- < i++) {
                break;
            }
            System.out.println("i >> " + i );
            System.out.println("j >> " + j );
            System.out.println("________");
        } while (i < 5);
        System.out.println(Integer.toString(i)
                + Integer.toString(j));
    }
}
