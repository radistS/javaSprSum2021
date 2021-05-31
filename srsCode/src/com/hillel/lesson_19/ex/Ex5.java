package com.hillel.lesson_19.ex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex5 {
    public static void main(String[] args) {
        Boolean [] arr = new Boolean[2];
        System.out.println(Arrays.deepToString(arr));
        List<Boolean> list = new ArrayList<>();
        list.add(arr[0]);
        list.add(arr[1]);
        System.out.println(list);
        if (list.remove( 0 )) {
            list.remove( 1 );
        }
        System. out .println(list);
    }
}

