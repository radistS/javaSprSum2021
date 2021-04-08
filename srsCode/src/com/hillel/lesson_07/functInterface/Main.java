package com.hillel.lesson_07.functInterface;

public class Main {

    public static void main(String[] args) {
        Print print = () -> System.out.println("Hello world");

        PrintWord printWord = (String str) -> System.out.println(str);

        Calc calc = (int a, int b) -> {
            return a + b;
        };

        System.out.println(calc.calc(1, 3));

        print.print();

        printWord.print("Hello");

        ToString toString = (Object o) -> {
            return o.toString();
        };
    }
}
