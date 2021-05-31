package com.hillel.lesson_19.ex;

public class Ex3 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i < 7; i++) {
            if (i == 4)
                break;
            else
                continue;
//            sum += i;
        }

        System.out.println(sum);
    }
}



