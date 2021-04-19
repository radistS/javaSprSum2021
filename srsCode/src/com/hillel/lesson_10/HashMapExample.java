package com.hillel.lesson_10;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapExample {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>(5, 0.75f);

        map.put("one", "one");
        map.put("two", "two");
//        System.out.println(map.size());
        map.put("two", "two_1");
//        System.out.println(map.size());
        System.out.println(map.get("two"));
        map.put("four", "two_1");

//        System.out.println(map.size());
        map.put(null, "two_1");
//        System.out.println(map.size());
        map.put(null, "two_2");
//        System.out.println(map.size());
//        System.out.println(map.get(null));

        System.out.println();
        System.out.println("-------------");
        Set<String> set = map.keySet();

        for (Object key : set) {
            System.out.println(key + " -> " + map.get(key));
        }

        map.put("five", "five");

        System.out.println("-------------");
        set = map.keySet();

        for (Object key : set) {
            System.out.println(key + " -> " + map.get(key));
        }
    }
}
