package com.hillel.lesson_10.ex;

import java.util.ArrayList;
import java.util.List;

public class EX1 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        for (Integer i : list) {
            System.out.print(i + " ");
            break;
        }
    }
}
