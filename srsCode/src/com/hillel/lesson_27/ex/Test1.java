package com.hillel.lesson_27.ex;

public class Test1 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0, j = 0; i < 6 && j < 5; ++i, j = i + 1) {
            sum = - i;
            System.out.println("------------------");
            System.out.println("i >> " + i + " , j >> " + j);
            System.out.println("SUM >>> " + sum);
        }
    }
}
