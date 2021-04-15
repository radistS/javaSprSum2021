package com.hillel.lesson_09.coll;

public class Main {
    public static void main(String[] args) {
        Count c = new Count();

        System.out.println(c.getCount());
        c.add();
        c.add();
        c.add();
        System.out.println(c.getCount());

        c.remove();

        c.add();
        System.out.println(c.getCount());
    }
}
