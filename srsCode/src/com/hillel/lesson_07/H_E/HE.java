package com.hillel.lesson_07.H_E;

import java.util.Objects;

public class HE {
    public static void main(String[] args) {
        Test test1 = new Test(1, 3);
        Test test2 = new Test(3, 1);
        System.out.println(test1.hashCode());
        System.out.println(test2.hashCode());

        System.out.println(test1.equals(test1));


        Test test3 = null;
        Test test4 = new Test(3, 1);

        System.out.println(test4.equals(test3));

    }
}

class Test {
    Integer a;
    Integer b;
    Integer c;

    public Test(Integer a, Integer b) {
        this.a = a;
        this.b = b;
    }

    public void setA(Integer a) {
        this.a = a;
    }

    public void setB(Integer b) {
        this.b = b;
    }

    public void setC(Integer c) {
        this.c = c;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Test test = (Test) o;
        return Objects.equals(a, test.a) &&
                Objects.equals(b, test.b);
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, b);
    }
}
