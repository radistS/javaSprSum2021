package com.hillel.lesson_23.reflection;

import java.lang.reflect.Field;
import java.util.ArrayList;

public class ArrayLIstReflection {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {

       ArrayList alo = new ArrayList(10);

        System.out.println(alo);

        Class al = alo.getClass();

        Field size = al.getDeclaredField("size");
        size.setAccessible(true);
        size.set(alo, 4);
        size.setAccessible(false);
        size.set(alo, 12);
        alo.add(12);
        System.out.println(alo);

        Field ed = al.getDeclaredField("elementData");
        ed.setAccessible(true);
        Object[] strArr = (Object[]) ed.get(alo);

        for (Object s : strArr) {
            System.out.println(s);
        }
        strArr[1] = 1;
        strArr[8] = 8;

        for (Object s : strArr) {
            System.out.println(s);
        }

        System.out.println(alo);




    }
}
