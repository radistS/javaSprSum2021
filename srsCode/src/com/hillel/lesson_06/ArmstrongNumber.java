package com.hillel.lesson_06;
// Напишите Java-программу для проверки является ли введенное число - числом Армстронга.
//Прежде всего, нам нужно понять, что такое число Армстронга. Число Армстронга это число, значение которого равно сумме цифр, из которых оно состоит, возведенных в степень, равную количеству цифр в этом числе. Как пример - число 371:
//    371 = 3*3*3 + 7*7*7 + 1*1*1 = 27 + 343 + 1 = 371
//Если у вас число четырехзначное:
//    8208 = 8*8*8*8 + 2*2*2*2 + 0*0*0*0 + 8*8*8*8 = 4096 + 16 + 0 + 4096 = 8208


import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        // input
//        String value = new Scanner(System.in).next();
//
//        // number validation
//        int i = Integer.parseInt(value);
//        int summ = 0;
//        int numberLength = value.length();
//
//        for (String s : value.split("")){
//            summ += pow(Integer.parseInt(s), numberLength);
//        }
//
//        System.out.println(summ == i);

        armstrongNumberGenerator(10);
    }


    private static int pow(int i, int n){
        return (int) Math.pow(i, n);
    }

    private static void armstrongNumberGenerator(int n){
        int i = 0;
        int count = 10;

        while (i < n){
            String value = String.valueOf(count);
            int summ = 0;
            int numberLength = value.length();

            for (String s : value.split("")){
                summ += pow(Integer.parseInt(s), numberLength);
            }

            if (summ == count) {
                System.out.println(count);
                i++;
            }
            count++;
        }
    }
}
