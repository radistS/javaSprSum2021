package com.hillel.lesson_11.ex;

import java.util.ArrayList;
import java.util.List;

public class Ex2 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("apple");
        list.add("carrot");
        list.add("banana");
        list.add(1, "plum");
        System.out.println(list);
    }
}
