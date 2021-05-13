package com.hillel.lesson_14.stream_cont;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class StreanStart {
    public static void main(String[] args) {

        System.out.println("--- Stream.empty ---");
        Stream.empty().forEach(p-> System.out.println());

        System.out.println("---  list.stream() ---");
        List<String> l1 = List.of("1","2","3","4","5");
        l1.stream().forEach(p -> System.out.print(p + " "));

        System.out.println();
        System.out.println("--- Array stream ---");
        String[] str = new String[5];
        str[0] = "1";
        str[1] = "2";
        str[2] = "3";
        str[3] = "4";
        str[4] = "5";

        Arrays.stream(str).forEach(p -> System.out.print(p + " "));

        System.out.println();
        System.out.println("--- Stream.of ---");
        Stream.of("1","2","3","4","5").forEach(p -> System.out.print(p + " "));

        System.out.println();
        System.out.println("--- map stream ---");
        Map<String, String> map = Map.of("1","1","2","2","3","3");
        map.entrySet().stream().forEach(e -> System.out.println(e.getKey() + " " + e.getValue()));




    }
}
