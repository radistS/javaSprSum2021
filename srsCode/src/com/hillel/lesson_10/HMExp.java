package com.hillel.lesson_10;

import java.util.HashMap;
import java.util.Map;

public class HMExp {
    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();

        for (int i = 0; i < Integer.MAX_VALUE; i++){
            if (i % 10_000_000 == 0) System.out.print("#");
            map.put(i,i);
        }
    }
}
