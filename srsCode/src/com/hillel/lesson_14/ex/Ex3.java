package com.hillel.lesson_14.ex;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Ex3 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("meat");
        list.add("bread");
        list.add("sassage");
        // define
        Stream<String> stream = list.stream()
                .filter(a -> a.length() < 5)
                .map(a -> a + "_map");
        list.add("eggs");
        // run
        stream.forEach(System.out::println);
    }
}
