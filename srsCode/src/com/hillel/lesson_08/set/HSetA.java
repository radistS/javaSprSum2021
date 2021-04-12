package com.hillel.lesson_08.set;

import java.util.HashSet;
import java.util.List;

public class HSetA {
    public static void main(String[] args) {
        HashSet set = new HashSet();

        set.add(List.of(1, 2, 3, 4));
        set.add(List.of(1, 2, 3, 4));
        set.add(List.of(1, 2, 3));

        System.out.println(set);

    }
}
