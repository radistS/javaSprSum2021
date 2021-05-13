package com.hillel.lesson_14.ex;

import java.util.ArrayList;
import java.util.List;

public class Ex1 {
    public static void main(String[] args) {
        Integer i = 10;
        List<Integer> list = new ArrayList<>();
        list.add(i);
        list.add(i *= 2);
        list.add(i);
        list.add(10);
        System.out.println(list);
        list.removeIf(g -> g == 10);
        System.out.println(list);
    }
}
