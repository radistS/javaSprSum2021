package com.hillel.lesson_14.stream_cont;

import java.sql.SQLOutput;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ForEachStream {
    public static void main(String[] args) {
        Stream.of(1,3,4,2,9,5,6,1,51,3,4,2,9,5,6,1,53,4,2,9,5,6,1,51,3,4,2,9,5,6,1,5)
                .parallel()
                .forEach(e -> System.out.print(e + " "));

        System.out.println();

        Stream.of(1,3,4,2,9,5,6,1,51,3,4,2,9,5,6,1,53,4,2,9,5,6,1,51,3,4,2,9,5,6,1,5)
                .parallel()
                .forEachOrdered(e -> System.out.print(e + " "));

        System.out.println();
        List<Integer> collect = Stream.of(1, 3, 4, 2, 9, 5, 6, 1, 51, 3, 4, 2, 9, 5, 6, 1, 53, 4, 2, 9, 5, 6, 1, 51, 3, 4, 2, 9, 5, 6, 1, 5)
                .parallel().collect(Collectors.toList());

        collect.forEach(e -> System.out.print(e + " "));

        System.out.println();
        Set<Integer> collect1 = Stream.of(1, 3, 4, 2, 9, 5, 6, 1, 51, 3, 4, 2, 9, 5, 6, 1, 53, 4, 2, 9, 5, 6, 1, 51, 3, 4, 2, 9, 5, 6, 1, 5)
                .collect(Collectors.toSet());

        collect1.forEach(e -> System.out.print(e + " "));

        String str = Stream.of(1, 3, 4, 2, 9, 5, 6, 1, 51, 3, 4, 2, 9, 5, 6, 1, 53, 4, 2, 9, 5, 6, 1, 51, 3, 4, 2, 9, 5, 6, 1, 5)
                .map(String::valueOf).collect(Collectors.joining("-", "<", ">"));
        System.out.println();
        System.out.println(str);

    }
}
