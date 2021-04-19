package com.hillel.lesson_10;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetEx {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("one");
        list.add("two");
        list.add("one");
        list.add("four");
        list.add("five");

        System.out.println(list);

        System.out.println("---------");

        Set<String> set = new HashSet<>(list);
        System.out.println(set);

        System.out.println(set.add("one"));
        System.out.println(set.add("one"));

        System.out.println(set);

        for (String s : set){
            System.out.println(s);
        }

        System.out.println(set.isEmpty());
        set.clear();
        System.out.println(set.isEmpty());
    }
}
