package com.hillel.lesson_14.stream_cont;

import java.util.stream.Stream;

public class FindStream {
    public static void main(String[] args) {
        Integer any = Stream.of(1,3,4,2,9,5,6,1,5)
               .findAny().get();

        Integer first = Stream.of(1,3,4,2,9,5,6,1,5)
               .findFirst().get();

        System.out.println(any);
        System.out.println(first);


    }
}
