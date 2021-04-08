package com.hillel.lesson_07.enumer;

public class OperationRun {
    public static void main(String[] args) {
        System.out.println(Operation.PLUS.calculate(1, 2));
        System.out.println(Operation.MULT.calculate(1, 2));
        System.out.println(Operation.DIVIDE.calculate(1, 2));
        System.out.println(Operation.MINUS.calculate(1, 2));
    }
}
