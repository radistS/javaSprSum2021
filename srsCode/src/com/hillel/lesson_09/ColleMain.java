package com.hillel.lesson_09;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ColleMain {
    public static void main(String[] args) {

        List<String> str = new ArrayList<>();

        str.add("1");
        str.add("2");
        str.add("3");
        str.add("4");
        str.add("5");
        str.add("6");
        str.add("7");

        // #1
        for (int i = 0; i < str.size(); ) {
            System.out.print(str.get(i++) + " ");
        }
        System.out.println();
        // #2
        for (String s : str) {
            System.out.print(s + " ");
        }
        System.out.println();
        // #3
        Iterator iter = str.iterator();
        while (iter.hasNext()) {
            System.out.print(iter.next() + " ");
        }


    }
}
