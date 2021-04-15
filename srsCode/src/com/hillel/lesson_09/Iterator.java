package com.hillel.lesson_09;

import java.util.ArrayList;
import java.util.List;

public class Iterator {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();

        list1.add("a");
        list1.add("b");
        list1.add("c");
        list1.add("d");
        list1.add("e");
        list1.add("g");

        java.util.Iterator<String> iterator = list1.iterator();

        while (iterator.hasNext()){
            String s = iterator.next();
            if(s.equals("b"))
                iterator.remove();
            System.out.println(s);
        }

        System.out.println(list1);

        for (int i = 0; i < list1.size(); i++){
            if (list1.get(i).equals("c")){
                list1.remove(i);
            }
        }


        System.out.println(list1);

        list1.removeIf(s -> s.equals("e"));

        System.out.println(list1);

    }
}
