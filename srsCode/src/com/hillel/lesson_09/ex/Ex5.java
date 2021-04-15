package com.hillel.lesson_09.ex;

public class Ex5 {
    Ex5() {
    }

    Ex5(Ex5 ex) {
        ex5 = ex;
    }

    Ex5 ex5;

    public static void main(String[] args) {
        Ex5 ex5_1 = new Ex5();

        ex5_1.ex5 = ex5_1;

        Ex5 ex5_2 = new Ex5(ex5_1);

        ex5_2.go();

        Ex5 ex5_3 = ex5_2.ex5;

        ex5_3.go();

        Ex5 ex5_4 = ex5_1.ex5;

        ex5_4.go();

    }

    void go() {
        System.out.println("hi");
    }
}
