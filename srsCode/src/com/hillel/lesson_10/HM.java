package com.hillel.lesson_10;

import java.util.HashMap;
import java.util.Map;

public class HM {

    public static void main(String[] args) {

        Map<String, String> map1 = new HashMap<String, String>(12, 0.75f);
        Map<String, String> map2 = new HashMap<String, String>(17);
        Map<String, String> map3 = new HashMap<String, String>();

//        map1.put("1", "1");
//        System.out.println(map1.size());
//        System.out.println(map1.get("1"));
//        System.out.println(map1.containsKey("1"));
//        System.out.println(map1.containsValue("1"));
//        map1.remove("1");
//        System.out.println(map1.size());
//        System.out.println(map1.get("1"));
//        System.out.println(map1.containsKey("1"));
//        System.out.println(map1.containsValue("1"));

        map1.put("1", "1");
        map1.put("1", "2");
        map1.put("1", "3");

        System.out.println(map1.get("1"));

        map1.put(null, null);
        map1.put("2", null);

        System.out.println(map1.size());

        System.out.println(map1);



    }
}
