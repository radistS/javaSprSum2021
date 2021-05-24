package com.hillel.lesson_17.io;

import java.util.Scanner;

public class ScannerInt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите значения...");
        if (sc.hasNextInt()){
            System.out.println(sc.nextInt());
        } else {
            System.out.println("не цифра...");
        }

    }
}
