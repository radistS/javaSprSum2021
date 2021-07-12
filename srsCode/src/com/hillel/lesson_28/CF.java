package com.hillel.lesson_28;

import org.apache.commons.lang3.JavaVersion;

import java.time.Year;
import java.util.Arrays;
import java.util.Optional;
import java.util.Spliterator;
import java.util.Spliterators;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.stream.Stream;

public class CF {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        System.out.println(Integer.divideUnsigned(200000000,-1));

        System.out.println((double) (200000000 / (((long) -1000000) & 0xffffffffL)));
    }
}
