package com.hillel.lesson_16.lambda;

public class LRun {

    public static void main(String[] args) {

        First first = () -> System.out.println("Hello");

        first.print();

        first = () -> System.out.println("Hello new");

        first.print();

        Second second = (s1, s2) -> {
            String str = s1 + " " + s2;
            return str;
        };

        System.out.println(second.print("s", "s"));
        second = (s1, s2) -> s1 + " " + s2;

        System.out.println(second.print("s", "s"));

        print(second.print("s", "s"));

    }

    static void print(String s){
        System.out.println(s);
    }

}
