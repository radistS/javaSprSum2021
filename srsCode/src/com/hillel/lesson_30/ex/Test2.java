package com.hillel.lesson_30.ex;

public class Test2 {
    public static void main(String[] args) {
        Test2 test = new Test2();
        test.print("C");
    }

    public void print() {
        System.out.println("A");
    }

    public static void print(String s) {
        System.out.println("B");
    }
}
