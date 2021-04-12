package com.hillel.lesson_08.ex;

public class Ex1 extends Foo {
    public static String sign() {
        System.out.println("ex1");
        return "fa";
    }

    public static void main(String[] args) {
        Ex1 ex = new Ex1();
        Foo foo = new Ex1();
//        Ex1 e = new Foo();


        System.out.println(ex.sign() + " " + foo.sign());
    }
}

class Foo {
    public static String sign() {
        System.out.println("Foo");
        return "la";
    }
}
