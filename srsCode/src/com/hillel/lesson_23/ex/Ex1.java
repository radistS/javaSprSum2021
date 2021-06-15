package com.hillel.lesson_23.ex;

import java.io.IOException;

public class Ex1 extends Test {
    @Override
    public void display() throws IOException {
        System.out.println("Derived");
    }

    public static void main(String[] args) throws IOException {
        Test object = new Test();
        object.display();

        Ex1 object1 = new Ex1();
        object1.display();
    }
}

class Test {
    public void display() throws IOException {
        System.out.println("Test");
    }

}