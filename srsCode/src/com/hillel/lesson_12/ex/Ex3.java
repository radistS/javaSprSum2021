package com.hillel.lesson_12.ex;

public class Ex3 extends Ex3_1 {
    public void print(int d) {
        System.out.println("EX3");
    }

    public static void main(String[] args) {
        Ex3 ex = new Ex3();
        ex.print(1D);
        ex.print(2.0);
    }
}

class Ex3_1 {
    public void print(double d) {
        System.out.println("EX3_1");
    }

}
