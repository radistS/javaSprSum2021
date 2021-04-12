package com.hillel.lesson_08.list;

import java.util.ArrayList;
import java.util.List;

public class AL {
    public static void main(String[] args) {
        List<String> strList = new ArrayList<>();

        System.out.println(strList.isEmpty());
        System.out.println(strList.size());

        strList.add("1");
        strList.add("2");
        strList.add("3");

        System.out.println(strList);

        System.out.println(strList.hashCode());


        List<String> str = new ArrayList<>();
        str.addAll(strList);

        System.out.println(str);
        System.out.println(str.hashCode());

        System.out.println(str.containsAll(strList));

        strList.remove("1");
        System.out.println(strList);

        System.out.println(str.containsAll(strList));


        List<Integer> l = new ArrayList<>();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(5);
        l.add(6);
        l.add(7);
        System.out.println(l.size());

        System.out.println(l);
        l.removeIf(e -> e % 2 == 0);
        System.out.println(l);

        System.out.println(l.get(1));

        for (Integer i : l) System.out.println(i);
    }
}
