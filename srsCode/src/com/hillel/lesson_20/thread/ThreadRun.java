package com.hillel.lesson_20.thread;

public class ThreadRun implements Runnable {

    @Override
    public void run() {
        try {
            Thread.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println( Thread.currentThread().getName() + " : RUNNABLE >> Run new thread ... ");
    }
}
