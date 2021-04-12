package com.hillel.lesson_08;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ALvsLL {

    /*
    100_000 (List)
    10_000  (put in center by one per time)


    ArrayList ???  O(n) = O(1) + O(n)
    LinkedList ??? O(n) = O(n) + O(1)
     */
    public static void main(String[] args) {

        List<String> al = new ArrayList<>();
        List<String> ll = new LinkedList<>();

        int listSize = 100_000;
        int inputSize = 10_000;
        int count = 10;

        for (int j = 0; j < count; j++) {
            for (int i = 0; i < listSize; i++){
                al.clear();
                ll.clear();
                al.add("al_" + i);
                ll.add("ll_" + i);
            }
            System.out.println("Attempt number #" + j + "------------------");
            Long start = System.currentTimeMillis();
            for (int i = 0; i < inputSize; i++) {
                al.add(al.size() / 2, "al_add_" + i);
            }
            System.out.println("AL add duration : " + (System.currentTimeMillis() - start));


            start = System.currentTimeMillis();
            for (int i = 0; i < inputSize; i++) {
                ll.add(ll.size() / 2, "ll_add_" + i);
            }
            System.out.println("LL add duration : " + (System.currentTimeMillis() - start));
            System.out.println();
        }

    }
}
