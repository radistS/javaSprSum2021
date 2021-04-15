package com.hillel.lesson_09.coll;

import java.util.ArrayList;
import java.util.List;

public class ALsetValues {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("_");
        list.add("_");
        list.add("_");
        list.add("_");
        list.add("_");

        System.out.println(list);
        list.add(3,"-");
        System.out.println(list);
        list.set(3, "*");
        System.out.println(list);
        list.set(3, null);
        System.out.println(list);
    }
}
