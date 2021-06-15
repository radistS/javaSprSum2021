package com.hillel.lesson_23.reflection;

import java.lang.reflect.Constructor;

public class ClassGetConstructor {
    public static void main(String[] args) throws ClassNotFoundException {

//        Baz b = new Baz("2", 2);

//        Class<?> cls = Class.forName("lesson_24.reflection.Baz");
        Class cls = Baz.class;

        Constructor[] constructors = cls.getConstructors();
        // for get public constructors
//        for (Constructor constructor : constructors) {
//            System.out.println();
//            System.out.println(constructor);
//            Class<?>[] params = constructor.getParameterTypes();
//            for (Class<?> param : params) {
//                System.out.println(param.getName());
////                System.out.println(param.getTypeName());
//            }
//        }

        System.out.println();
        // for get public and private constructors
        constructors = cls.getDeclaredConstructors();
        for (Constructor constructor : constructors) {
            System.out.println();
            System.out.println(constructor);
            Class<?>[] params = constructor.getParameterTypes();
            for (Class<?> param : params) {
                System.out.println(param.getName());
            }
        }
    }
}

class Baz{

    private String val1;
    private Integer val2;

    public Baz(String val1, Integer val2) {
        this.val1 = val1 = "val1";
        this.val2 = val2 = 1;
    }

    public Baz(String val1) {
        this.val1 = val1;

    }
    private Baz(Integer val2) {
        this.val2 = val2;
    }

    public Baz() {
    }
}