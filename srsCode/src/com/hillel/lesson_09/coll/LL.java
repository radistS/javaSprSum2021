package com.hillel.lesson_09.coll;

import java.util.LinkedList;
import java.util.List;

public class LL {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>();

        System.out.println(list.size());
//        ((LinkedList<String>) list).removeFirst();
//        ((LinkedList<String>) list).removeLast();
        list.add("swww1");
        list.add("swww2");
        list.add("swww3");
        list.add(1,"sww1_1");

        System.out.println(list);


    }
}
