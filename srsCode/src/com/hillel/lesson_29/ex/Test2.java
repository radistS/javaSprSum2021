package com.hillel.lesson_29.ex;

public class Test2 {
    public static void main(String[] args) {
        Boolean[] boo = new Boolean[3];
        boo[0] = new Boolean(Boolean.parseBoolean("tRUE"));
        boo[1] = new Boolean("True");
        boo[2] = new Boolean(false);
        System.out.println(boo[0] && boo[1] || boo[2]);

        System.out.println(boo[0]);
        System.out.println(boo[1]);
        System.out.println(boo[2]);
        System.out.println(Boolean.parseBoolean("tRUE")
        );

        System.out.println(new Boolean("afcaszf")); // true false
    }
}
