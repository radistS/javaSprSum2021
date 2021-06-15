package com.hillel.lesson_23.reflection;

import java.io.Serializable;

public class ClassInt {
    public static void main(String[] args) {
        Booz classBooz = new Booz();
        Class booz = classBooz.getClass();

        Class<?>[] inter = booz.getInterfaces();

        for (Class<?> i : inter ){
            System.out.println(i.getName());
        }

    }
 }


class Booz implements Cloneable, AutoCloseable, Serializable, Comparable{
    @Override
    public void close() throws Exception {

    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}