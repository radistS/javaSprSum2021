package com.hillel.lesson_13.steams;

import java.util.List;

public class SkipLimitStream {
    public static void main(String[] args) {
        List<Integer> ints = List.of(1,2,3,4,5,6,7,8,9,10);

        ints.stream()
                .skip(1)
                .limit(5)
                .filter(i -> i % 2 == 0)
                .map(i -> i*i)
                .forEach(i -> System.out.print(i + " "));
    }
}
