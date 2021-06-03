package com.hillel.lesson_20.thread;

public class InteruptMet {

    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thr();
        thread.start();

        while (true) {
            System.out.println(thread.isAlive());
            Thread.sleep(1300);
            int rez = Count.getCount();
            System.out.println(rez + " >> " + rez % 3);

            if (rez % 3 == 0) {
                thread.interrupt();
                break;
            }
        }

        System.out.println("finish main thread");
        Thread.sleep(2000);
        System.out.println(thread.isAlive());
    }
}

class Thr extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            try {
                Thread.sleep(233);
                Count.increment();
                System.out.println(Count.getCount());
            } catch (InterruptedException e) {
                System.out.println("programm finish");
//                break;
            }
        }
    }
}

class Count {
    private static int count = 0;

    public static void increment() {
        count++;
    }

    public static int getCount() {
        return count;
    }
}