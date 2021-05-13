package com.hillel.lesson_13.steams;

import java.util.List;

public class StreamRun {
    public static void main(String[] args) {
        List<Integer> ints = List.of(1,2,3,4,5,6,7,8,9,10);

        long s = System.currentTimeMillis();
        ints.stream().peek(p -> {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).forEach(System.out::print);
        System.out.println();
        System.out.println("time : " + (System.currentTimeMillis() - s));
        s = System.currentTimeMillis();
        ints.parallelStream().peek(p -> {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).forEach(System.out::print);
        System.out.println();
        System.out.println("time : " + (System.currentTimeMillis() - s));
    }
}
