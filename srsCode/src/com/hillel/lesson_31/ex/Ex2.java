package com.hillel.lesson_31.ex;

public class Ex2 {
    public static void main(String[] args) {
        Robot r = new Robot();
        r.printName(1);
        r.printName(1.0);
    }
}

class Robot{
    @Deprecated
    public void printName(double d){
        System.out.println("I am a Robot");
    }
}