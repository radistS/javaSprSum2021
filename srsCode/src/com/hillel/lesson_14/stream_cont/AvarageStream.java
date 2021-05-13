package com.hillel.lesson_14.stream_cont;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class AvarageStream {
    public static void main(String[] args) {
        System.out.println(IntStream.range(2, 10)
                .average().getAsDouble());

        System.out.println(Stream.of(1, 5, 3, 9).mapToDouble(e -> e).average().getAsDouble());

        System.out.println(Stream.of(1, 1, 1, 2, 2, 2, 1, 1, 5).mapToLong(e -> e).sum());
    }
}
