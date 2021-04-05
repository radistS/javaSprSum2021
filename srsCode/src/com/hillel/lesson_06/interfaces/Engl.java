package com.hillel.lesson_06.interfaces;

public class Engl implements Say{
    @Override
    public void sayHello() {
        System.out.println("Say hello ...");
    }

    @Override
    public void sayGoodBuy() {
        System.out.println("Goodbuy ...");
    }
}
