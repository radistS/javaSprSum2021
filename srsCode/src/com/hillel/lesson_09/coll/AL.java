package com.hillel.lesson_09.coll;

import java.util.*;

public class AL {
    public static void main(String[] args) {

       String[] mass1 = {"1","2","3","4","5","6","7", null, null};
//       String[] mass2 = new String[(mass1.length*3) / 2 + 1];
//
//
//       System.arraycopy(mass1, 0, mass2, 0, 7);
//
//        System.out.println(Arrays.deepToString(mass1));
//        System.out.println(Arrays.deepToString(mass2));
//
//        mass1 = mass2;
//        mass2 = null;
//
//        System.out.println(Arrays.deepToString(mass1));

        int index = 3;

        System.arraycopy(mass1, index, mass1, index + 1, mass1.length - index - 1);

        System.out.println(Arrays.deepToString(mass1));


        mass1[index] = "_";

        System.out.println(Arrays.deepToString(mass1));

        mass1[8] = "8";

        System.arraycopy(mass1, index + 1, mass1, index, mass1.length - index - 1);

        System.out.println(Arrays.deepToString(mass1));

        mass1[mass1.length -1] = null;

        System.out.println(Arrays.deepToString(mass1));

    }
}
