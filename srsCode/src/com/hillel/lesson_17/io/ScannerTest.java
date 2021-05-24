package com.hillel.lesson_17.io;

import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner("Hello, world, Hello world Hello world ");
        sc.useDelimiter(",");
        while (sc.hasNext()){
//            System.out.println(sc.next().trim());
            System.out.println(sc.next());
        }
    }
}
