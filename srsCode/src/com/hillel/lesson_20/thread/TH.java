package com.hillel.lesson_20.thread;

public class TH implements Runnable{
    @Override
    public void run() {
        System.out.println("thread name: " + Thread.currentThread().getName());
    }
}
