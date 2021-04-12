package com.hillel.lesson_08.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ALandLL {
    public static void main(String[] args) {
        LinkedList<String> linked = new LinkedList<>();

         linked.add("1");
         linked.add("2");
         linked.add("3");
         linked.add("4");
         linked.add("5");


        System.out.println(linked.getFirst());
        System.out.println(linked.getLast());
    }
}
