package com.hillel.lesson_20.thread;

public class HelloWorld {
    public static void main(String[] args) {
        int i = 0;
        while (true) {
            Thread t = new Thread(() -> {
                while (true){
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });
            t.setName("TH - " + i++);
            t.start();
            System.out.println("start thread # " + i);
        }

    }
}
