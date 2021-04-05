package com.hillel.lesson_06.interfaces;

public interface Say {

    static String str = "test"; // static field only

    void sayHello();

    default void sayGoodBuy() {
        System.out.println("Good buy default .....");
    }

    static void hello(){
        System.out.println("static ....");
    };
}
