package com.hillel.lesson_10;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class RemoveFromCollection {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i <= 10; i++) {
            list.add(i);
        }
        System.out.println(list);

//        for (int i = 0; i < list.size(); i++) {
//            if (i % 2 == 0) list.remove(i);
//        }
//
//        System.out.println(list);

//        for (int a : list) {
//            if (a % 2 == 0) list.remove(a);
//        }
//
//        System.out.println(list);

        Iterator<Integer> iter = list.iterator();
//
//        while (iter.hasNext()) {
//            Integer a = iter.next();
//            System.out.print(a + " ");
//            if (a % 2 == 0) iter.remove();
//        }
//        System.out.println();
//        System.out.println(list);


        while (true){
            Integer a = iter.next();
            System.out.print(a + " ");
        }
    }
}
