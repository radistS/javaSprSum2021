package com.hillel.lesson_08.set;

import java.util.Set;
import java.util.TreeSet;

public class TSet {
    public static void main(String[] args) {
        Set<Integer> set = new TreeSet();

        set.add(10);
        set.add(4);
        set.add(1);
        set.add(8);
        set.add(2);
        set.add(6);
        set.add(3);

        System.out.println(set);
        set.add(5);
        System.out.println(set);
    }
}
