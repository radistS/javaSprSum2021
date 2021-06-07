package com.hillel.lesson_21.ex;

class First {
    public First() {
//        super();
        System.out.println("a");
    }
}

class Second extends First {
    public Second() {
        super();
        System.out.println("b");
    }
}

class Third extends Second {
    public Third() {
//        super();
        System.out.println("c");

    }
}

public class ex2 {
    public static void main(String[] args) {
        Third c = new Third();
    }
}

