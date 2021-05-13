package com.hillel.lesson_13.ex;

import java.util.ArrayList;
import java.util.List;

public class Ex2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(15);
        list.add(25);
        list.add(15);
        list.add(25);
//        list.remove(Integer.valueOf(15));
        list.remove(15);
        System.out.println(list);
    }
}


