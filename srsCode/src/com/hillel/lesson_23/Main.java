package com.hillel.lesson_23;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Object> list = new ArrayList();

        list.add("one");
        list.add("two");
        list.add(1);
        list.add(2);
        list.add(true);
        list.add(false);

        for (Object obj : list){
//            System.out.println(obj.getClass());
            if (obj instanceof String) {
                System.out.println((String) obj);
            }

            if (obj instanceof Integer){
                System.out.println((Integer) obj);
            }

            if (obj instanceof Boolean){
                System.out.println((Boolean) obj);
            }
        }
    }
}
