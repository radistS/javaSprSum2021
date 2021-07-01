package com.hillel.lesson_26.ex;

public class Test5 {
    public static void main(String[] args) {
        int x = 5;
        int y = 6;
        if ((y = 1) == x)
            System.out.println(y);
        else
            System.out.println(++y);
    }
}
