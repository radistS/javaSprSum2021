package com.hillel.lesson_20.ex;

class M {
    public M() {
        System.out.println("M");
    }
}

class N extends M {
    public N() {
        System.out.println("N");
    }
}

class O extends N {
    public O() {
        System.out.println("O");
    }
}

class P extends O {
    public P() {
        System.out.println("P");
    }
}

public class ex3 {
    public static void main(String args[]) {
        M obj = new O();
        if (obj instanceof M)
            System.out.print('M');
        if (obj instanceof N)
            System.out.print('N');
        if (obj instanceof O)
            System.out.print('O');
        if (obj instanceof P)
            System.out.print('P');
    }
}
