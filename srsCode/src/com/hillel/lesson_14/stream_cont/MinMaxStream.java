package com.hillel.lesson_14.stream_cont;

import java.util.stream.Stream;

public class MinMaxStream {
    public static void main(String[] args) {
        Integer min = Stream.of(1,3,4,2,9,5,6,1,5)
                .min(Integer::compareTo).get();

        Integer max = Stream.of(1,3,4,2,9,5,6,1,5)
                .max(Integer::compareTo).get();

        System.out.println(min);
        System.out.println(max);
    }
}
