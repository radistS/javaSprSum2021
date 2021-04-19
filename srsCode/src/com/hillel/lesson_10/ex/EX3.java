package com.hillel.lesson_10.ex;

import java.util.ArrayList;
import java.util.List;

public class EX3 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
//        list.add(3);

        for (Object s : list) {
            System.out.print(s + " ");
//            break;
        }
    }
}
