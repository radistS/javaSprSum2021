package com.hillel.lesson_14.task;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//2.   Вывести все предложения заданного текста в порядке возрастания количества слов в
//        каждом из них.
public class SentLengthSort {
    public static void main(String[] args) {
        sortByLength(StringTest.TEXT_R);
    }

    private static void sortByLength(String text) {
        Map<Integer, List<String>> collect = new TreeMap<>();

        collect = Arrays.stream(text.split("\\."))
                .map(String::trim)
                .collect(Collectors.groupingBy(e -> e.split(" ").length));

        new TreeMap<>(collect).forEach((key, value) -> System.out.println(key + " " + value));
    }



}
