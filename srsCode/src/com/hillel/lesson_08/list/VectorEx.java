package com.hillel.lesson_08.list;

import java.util.Vector;

public class VectorEx {
    public static void main(String[] args) {
//        List<String> vector = new Vector<>();
        Vector<String> vector = new Vector<>();
        System.out.println(vector.size());
        System.out.println(vector.add("One"));
        System.out.println(vector.add("Two"));
        System.out.println(vector.add(null));
        System.out.println(vector.add("Three"));
        System.out.println(vector.size());

        System.out.println(vector.toString());

        vector.remove("One");
        System.out.println(vector.toString());
        System.out.println(vector.size());
        vector.remove(1);
        System.out.println(vector.toString());

        vector.add(1, "ten");
        System.out.println(vector.toString());

        System.out.println(vector.firstElement());
        System.out.println(vector.lastElement());
    }
}
