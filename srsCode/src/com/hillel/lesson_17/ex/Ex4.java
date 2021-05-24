package com.hillel.lesson_17.ex;

import java.util.LinkedList;

public class Ex4 {
    public static void main(String[] args) {
        Demo demo = new Demo();
        demo.show();
    }
}
class Demo {
    public void show() {
        LinkedList<String> list = new LinkedList<>();
        list.add("test");
        System.out.println(list.getFirst());
    }
}
