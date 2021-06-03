package com.hillel.lesson_20.thread;

import lombok.SneakyThrows;

public class ThreadPrioroty {
    @SneakyThrows
    public static void main(String[] args) {
        ThrPrior t1 = new ThrPrior();
        ThrPrior t2 = new ThrPrior();

        t1.setPriority(Thread.MIN_PRIORITY);
        t1.setName("TH1MAX");
        System.out.println(t1.isAlive());
        t2.setPriority(Thread.MAX_PRIORITY);
        t2.setName("TH2MAX");
        t1.start();

//        while (t1.isAlive()){
//            System.out.println(t1.isAlive());
//            Thread.sleep(1234);
//        }
        t2.start();
    }
}

class ThrPrior extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
//            try {
//                Thread.sleep(500);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
            System.out.println(Thread.currentThread().getName() + " iter : " + i);
        }
    }
}

