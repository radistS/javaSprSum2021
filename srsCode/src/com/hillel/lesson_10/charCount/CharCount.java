package com.hillel.lesson_10.charCount;

import java.util.Map;
import java.util.TreeMap;

public class CharCount{
    public static void main(String[] args) {

        for (Map.Entry<String, Integer> entry : calculate(Text.getText()).entrySet()){
            System.out.println(entry.getKey() + " >>> " + entry.getValue());
        }

    }


    private static Map<String, Integer> calculate(String text){
        Map<String, Integer> map = new TreeMap<>();
        for (String s : normalize(text).split("")){
            if (!map.containsKey(s)){
                map.put(s, 1);
            } else {
                map.put(s, map.get(s) + 1);
            }
        }
        return map;
    }

    private static String normalize(String text) {
        // remove non special simbols and normalize text
        return text.replaceAll(" ", "").replaceAll("\\p{P}", "").toLowerCase();
    }
}
