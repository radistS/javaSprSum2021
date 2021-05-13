package com.hillel.lesson_13.streamExample;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PeekEx {
    public static void main(String[] args) {
        Stream.of(0, 3, 0, 5, 0, 5)
                .peek(x -> System.out.format("before distinct: %d%n", x))
                .distinct()
                .peek(x -> System.out.format("after distinct: %d%n", x))
                .map(x -> x * x)
                .forEach(x -> System.out.format("after map: %d%n%n", x));

//        List<BigDecimal> list = Stream.of(0, 3, 0, 5, 0, 5)
//                .map(i -> BigDecimal.valueOf(Long.getLong(i.toString())))
//                .collect(Collectors.toList());
//
//        System.out.println(list);
    }
}
