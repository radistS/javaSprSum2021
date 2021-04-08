package com.hillel.lesson_07.tempConverter;

public class RunExample {
    public static void main(String[] args) {
        System.out.println("C -> C : " + new CConverter().convert(35));
        System.out.println("C -> F : " +new FConverter().convert(35));
        System.out.println("C -> K : " +new KConverter().convert(35));
    }
}