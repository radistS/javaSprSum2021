package com.hillel.lesson_13.steams;

import com.hillel.lesson_13.RandomGenerator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ExListToSet {
    public static void main(String[] args) {
        List<Integer> intList = new ArrayList<>();

        for (int i = 0; i < 50; i++)
            intList.add(RandomGenerator.getIntValue(50));

        print(intList);

        Set<Integer> intSet = intList.stream()
                .skip(10)
                .limit(intList.size() - 15)
                .collect(Collectors.toSet());


        print(intSet);

        List<Integer> intL = intList.stream()
                .sorted()
                .skip(10)
                .limit(intList.size() - 15)
                .collect(Collectors.toList());

        print(intL);

    }

    private static void print(Collection<Integer> list) {
        System.out.println("------->");
        for (Integer i : list) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("-------->");
    }
}
