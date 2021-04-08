package com.hillel.lesson_07.enumer;

public enum Operation {
    PLUS,
    MINUS,
    MULT,
    DIVIDE;

    double calculate(double x, double y) {
        switch (this) {
            case PLUS:
                return x + y;
            case MINUS:
                return x - y;
            case MULT:
                return x * y;
            case DIVIDE:
                return x / y;
            default:
                throw new AssertionError("Unknown operations " + this);
        }
    }
}
