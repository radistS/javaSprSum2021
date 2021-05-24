package com.hillel.lesson_17.io;

import java.util.Scanner;

public class ScannerLine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "a";
        System.out.println("Введите значения...");
//        while (!str.equals("Q")) {
//            str = sc.nextLine();
//            System.out.println("--> " + str);
//        }
        do {
            str = sc.nextLine();
            System.out.println("--> " + str);
        } while (!str.equals("Q"));



    }
}
