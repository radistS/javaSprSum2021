package com.hillel.lesson_12;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class HSvsHM {

    public static void main(String[] args) {
        Map map = new HashMap(10);

        Set set = new HashSet(17);

        set.add("1");
        set.add("2");
        set.add("3");
        set.add("4");
        set.add("5");

        System.out.println(set);

        map.put("1", "");
        map.put("2", "");
        map.put("3", "");
        map.put("4", "");
        map.put("5", "");

        System.out.println(map);
    }
}
