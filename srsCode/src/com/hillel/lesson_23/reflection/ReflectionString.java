package com.hillel.lesson_23.reflection;

import java.lang.reflect.Array;
import java.lang.reflect.Field;

public class ReflectionString {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        String str = "Test value";
        System.out.println(str.hashCode());
        // one row comment
        System.out.println(str);
        Class clazz = str.getClass();
        Field field = clazz.getDeclaredField("value");
        field.setAccessible(true);
        field.set(str, "WTF".getBytes());
        System.out.println(str);
        System.out.println(str.hashCode());


        str = new String("WTF");
        System.out.println(str.hashCode());
        /*
         multi row comments #1
         multi row comments #2

         multi row comments #n
         */
//       /* int[] intArray = (int[]) Array.newInstance(int.class, 6);
//
//
//        // todo: update after merge
//        Array.set(intArray, 0, 123);
//        Array.set(intArray, 1, 456);
//        Array.set(intArray, 2, 789);
//        System.out.println(intArray.length);
//
//        Class arr = intArray.getClass();
//        Field length = arr.getDeclaredField("length");
//
//        System.out.println("intArray[0] = " + Array.get(intArray, 0));
//        System.out.println("intArray[1] = " + Array.get(intArray, 1));
//        System.out.println("intArray[2] = " + Array.get(intArray, 2));*/
    }
}