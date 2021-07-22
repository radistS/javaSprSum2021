package com.hillel.lesson_31.env;

public class TestEV {

    public static void main(String[] args) {
        System.getenv().forEach((k, v) -> System.out.println(k + ":" + v));

        System.out.println("-------------");

        System.out.println(System.getenv("PWD"));



    }
}
