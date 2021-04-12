package com.hillel.lesson_08.ex;

public class Ex3 extends Electronic implements Gadget {
    public void doSomething() {
        System.out.println("serf internet ...");
    }

    public static void main(String[] args) {
        new Ex3().doSomething();
        new Ex3().getPower();
    }
}

abstract class Electronic{
    void getPower(){
        System.out.println("plug in ...");
    }
}

interface Gadget{
    void doSomething();
}
