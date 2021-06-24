package com.hillel.lesson_25.ex;

import java.util.ArrayList;
import java.util.List;

public class Ex2 {
    public static void main(String[] args) {
        List<String> list_one = new ArrayList<>();
        list_one.add("one");
        list_one.add("two");
        list_one.add("one");
        list_one.add("three");
        list_one.add("four");
        list_one.add("five");

        List<String> list_two = new ArrayList<>();
        list_two.add("one");
        list_two.add("two");

        list_one.removeAll(list_two);

        for (String str : list_one)
            System.out.printf(str + " ");
    }
}
