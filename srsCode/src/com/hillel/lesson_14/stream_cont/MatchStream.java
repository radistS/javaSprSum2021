package com.hillel.lesson_14.stream_cont;

import java.util.stream.Stream;

public class MatchStream {
    public static void main(String[] args) {
        Boolean allMatchTrue = Stream.of(1,3,4,2,9,5,6,1,5)
                .allMatch(e -> e < 10);

        System.out.println(allMatchTrue);

        Boolean allMatchFalse = Stream.of(1,3,4,2,9,5,6,1,5)
                .allMatch(e -> e < 9);

        System.out.println(allMatchFalse);

        Boolean anyMatchTrue = Stream.of(1,3,4,2,9,5,6,1,5)
                .anyMatch(e -> e < 3);

        System.out.println(anyMatchTrue);

        Boolean anyMatchT = Stream.of(1,3,4,2,9,5,6,1,5)
                .anyMatch(e -> e == 9);

        System.out.println(anyMatchT);

        Boolean noneMatchTrue = Stream.of(1,3,4,2,9,5,6,1,5)
                .noneMatch(e -> e > 12);

        System.out.println(noneMatchTrue);
    }
}
