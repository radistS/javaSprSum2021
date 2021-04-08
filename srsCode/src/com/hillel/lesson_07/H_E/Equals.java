package com.hillel.lesson_07.H_E;

import java.util.Objects;

public class Equals {
    public static void main(String[] args) {
        Digit d = new Digit(1,1);
        Digit d1 = new Digit(1,1);
        Digit d2 = new Digit(1,1);

        // d = d -> true
        System.out.println("d = d -> true");
        System.out.println(d.equals(d));
        System.out.println("---------------------------");
        // d1 = d -> true; d = d1 -> true
        System.out.println("d1 = d -> true; d = d1 -> true");
        System.out.println(d1.equals(d));
        System.out.println(d.equals(d1));
        System.out.println("---------------------------");
        System.out.println(null == null);
        System.out.println("---------------------------");
        System.out.println(d.equals(null));
        System.out.println("---------");
        System.out.println(d1.equals(d));
        System.out.println(d.equals(d2));
        System.out.println(d1.equals(d2));
    }
}

class Digit{
    int a;
    int b;
    Digit d;

    public Digit() {
    }

    public Digit(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Digit digit = (Digit) o;
        return a == digit.a &&
                b == digit.b &&
                Objects.equals(d, digit.d);
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, b, d);
    }
}