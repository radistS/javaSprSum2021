package com.hillel.lesson_18.ex;

import java.util.ArrayList;
import java.util.List;

public class ex5 {
    public static void main(String[] args) {
        int[] mass = {1, 2};
        List<String> list = new ArrayList(10);
        list.add("03");
        list.add("04");
        System.out.println(mass.length + list.size() + ".");
        System.out.println("." + mass.length + list.size() + ".");
        System.out.println(mass.length + list.size() + "." + 2);
        System.out.println(mass.length + list.size() + 2);
    }
}


