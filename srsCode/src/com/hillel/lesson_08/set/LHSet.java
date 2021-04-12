package com.hillel.lesson_08.set;

import java.util.LinkedHashSet;
import java.util.Set;

public class LHSet {
    public static void main(String[] args) {
        Set<String> set = new LinkedHashSet<>();
        System.out.println(set.add("One"));
        System.out.println(set.add("Two"));
        System.out.println(set.add("Three"));
        System.out.println(set.add("Four"));
        System.out.println(set.add("Five"));

        System.out.println(set.toString());
    }
}
