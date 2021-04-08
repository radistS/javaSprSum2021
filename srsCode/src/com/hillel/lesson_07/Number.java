package com.hillel.lesson_07;

import java.util.Scanner;

//Найти число, цифры в котором идут в строгом порядке возрастания.
// Если таких чисел несколько, найти первое из них.
public class Number {
    public static void main(String[] args) {
//        System.out.println(check(new Scanner(System.in).nextInt()));

        for (int i = 0; i < 50; i++){
            int value = (int) (Math.random() * 10000);
            System.out.println(value + " >>> " +check(value));
        }
    }

    private static boolean check(int value){
        char[] c = String.valueOf(value).toCharArray();
        for (int i = 0; i < c.length - 1; i++) {
            if (c[i] > c[i + 1]) return false;

        }
        return true;
    }

}


