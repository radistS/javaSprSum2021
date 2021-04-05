package com.hillel.lesson_06.thisVSsuper;

public class Constr {

    public static void main(String[] args) {
        D d = new D();
    }

}


class A {

    public A() {
        System.out.println("A");
    }
}

class B extends A{

    public B() {
        System.out.println("B");
    }
}

class C extends B {

    public C() {
        System.out.println("C");
    }
}

class D extends C {

    public D() {
        System.out.println("D");
    }
}