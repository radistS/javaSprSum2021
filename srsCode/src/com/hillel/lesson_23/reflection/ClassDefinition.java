package com.hillel.lesson_23.reflection;

import java.lang.reflect.InvocationTargetException;

public class ClassDefinition {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        Class fooRefl = Class.forName("com.hillel.lesson_23.reflection.Foo");
        System.out.println(fooRefl.getName());

        Foo fooIn = (Foo) fooRefl.newInstance();

        // use this
        Foo constructor = (Foo) fooRefl.getDeclaredConstructor().newInstance();

        Foo foo = new Foo();
        constructor.print();
        Class fooClass = foo.getClass();

        System.out.println(fooClass.getName());
    }
}

class Foo {
    void print() {
        System.out.println("Class >> Foo.java");
    }
}
