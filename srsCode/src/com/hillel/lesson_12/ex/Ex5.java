package com.hillel.lesson_12.ex;

import java.util.HashSet;
import java.util.TreeSet;

public class Ex5 {
    public static void main(String[] args) {
        TreeSet<String> set = new TreeSet<>();
//        HashSet<String> set = new HashSet<>(4);
        set.add("Java");
        set.add("The");
        set.add("Java");
        set.add("JavaTheBest");

        for (String str : set) {
            System.out.print(str + " ");
        }
        System.out.println("\n");
    }
}
