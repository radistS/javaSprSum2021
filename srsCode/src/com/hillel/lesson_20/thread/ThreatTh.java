package com.hillel.lesson_20.thread;

public class ThreatTh extends Thread {

    public ThreatTh(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 20; i++){
            try {
                sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(getName() + " THREAD >> value >> " + i);
        }
    }
}
