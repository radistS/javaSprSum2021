package com.hillel.lesson_23.reflection;

import com.hillel.lesson_04.SrtExample;

import java.lang.reflect.Constructor;

public class ClasExample {

    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {

        String str = new String();
        System.out.println(str.getClass());

        Class strClass = Class.forName("java.lang.String");
        System.out.println(strClass);

        String s = (String) strClass.newInstance();
    }
}
