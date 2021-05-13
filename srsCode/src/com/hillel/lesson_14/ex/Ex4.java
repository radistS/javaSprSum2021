package com.hillel.lesson_14.ex;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Ex4 {
    public static void main(String[] args) {
        Set<String> set = new TreeSet<>();
        List<String> list = Stream.of("JPoint",
                "HolyJS",
                "Devoxx",
                "Devoxx",
                "HolyJS",
                "JPoint")
                .sequential()
                .filter(e -> new HashSet<String>().add(e))
                .peek(System.out::println)
                .collect(Collectors.toList());
        System.out.println(list);
    }
}
