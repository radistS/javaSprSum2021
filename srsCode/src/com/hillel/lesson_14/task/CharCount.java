package com.hillel.lesson_14.task;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class CharCount {
    public static void main(String[] args) {
        System.out.println(new TreeMap<>(calculateGroupBy(StringTest.TEXT_R)));
        System.out.println(calculate(StringTest.TEXT_R));

    }

    private static Map<String, Integer> calculate(String text) {
        Map<String, Integer> map = new TreeMap<>();
        Arrays.stream(
                text.replaceAll("\\p{P}", "")
                .replaceAll(" ", "")
                .toLowerCase(Locale.ROOT).split(""))
                .forEachOrdered(e -> {
                    if (!map.containsKey(e))
                        map.put(e, 1);
                    else
                        map.put(e, map.get(e) + 1);
                });
        return map;
    }

    private static Map<String, Integer> calculateGroupBy(String text) {
         return Arrays.stream(
                text.replaceAll("\\p{P}", "")
                        .replaceAll(" ", "")
                        .toLowerCase(Locale.ROOT).split(""))
                .collect(Collectors.groupingBy(e -> e)).
                         entrySet().stream()
                 .collect(Collectors.toMap(e -> e.getValue().get(0), e -> e.getValue().size()));

    }
}
