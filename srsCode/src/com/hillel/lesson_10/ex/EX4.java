package com.hillel.lesson_10.ex;

import java.util.ArrayList;
import java.util.List;

public class EX4 {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        list1.add("one");
        list1.add("two");
        List<String> list2 = list1;
//        List<String> list2 =new ArrayList<>();
//        list2.add("two");
        list2.add("one");
        list2.add("two");

        if (list1 == list2) System.out.println(1);
        else if (list1.equals(list2)) System.out.println(2);
        else System.out.println(3);
    }
}
