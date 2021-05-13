package com.hillel.lesson_14.stream_cont;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TermOperation {
    public static void main(String[] args) {
        Stream.of(1,3,4,2,9,5,6,1,51,3,4,2,9,5,6,1,53,4,2,9,5,6,1,51,3,4,2,9,5,6,1,5)
                .parallel()
                .forEach(e -> System.out.print(e + " "));

        System.out.println();
        Stream.of(1,3,4,2,9,5,6,1,51,3,4,2,9,5,6,1,53,4,2,9,5,6,1,51,3,4,2,9,5,6,1,5)
                .parallel()
                .forEachOrdered(e -> System.out.print(e + " "));

        System.out.println();
        List<Integer> iList = Stream.of(1,3,4,2,9,5,6,1,5)
                .collect(Collectors.toList());
        for (Integer i : iList) System.out.print(i + " ");
        System.out.println();

        Set<Integer> iSet = Stream.of(1,3,4,2,9,5,6,1,5)
                .collect(Collectors.toSet());
        for (Integer i : iSet) System.out.print(i + " ");
        System.out.println();

        Map<Integer, Integer> iMap = Stream.of(1,3,4,2,9,5,6,1,5)
                .distinct().collect(Collectors.toMap(i -> i, i -> i * i));
        for (Map.Entry i : iMap.entrySet()) System.out.println(i.getKey() + " " + i.getValue());
        System.out.println();


        String srt = (String) Stream.of(1,3,4,2,9,5,6,1,5)
                .distinct()
                .map(String::valueOf)
                .collect(Collectors.joining(".", "<", ">"));

        System.out.println(srt);
    }
}
