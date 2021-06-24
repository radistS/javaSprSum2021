package com.hillel.lesson_25.ex;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Ex3 {
    public static void main(String[] args) {
//        List<String> list = new ArrayList();
        List list = new ArrayList();
        list.add("one");
        list.add("two");
        list.add("three");

        Iterator<Integer> iter = list.iterator();

        while (iter.hasNext()){
            System.out.printf(iter.next() + " ");
        }
    }
}
