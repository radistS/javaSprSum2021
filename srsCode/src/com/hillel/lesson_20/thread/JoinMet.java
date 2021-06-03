package com.hillel.lesson_20.thread;

public class JoinMet {

    public static void main(String[] args) throws InterruptedException {
//        Thread thread1 = new ThreatTh("join-1");
        Thread thread2 = new ThreatJoin("join-2");
//        thread1.start();
        thread2.start();

        for (int i = 0; i < 30; i++) {
            try {
                Thread.sleep(250);
                System.out.println("run main thread : iteration >> " + i);
//                if (i == 5) {
//                    thread1.join();
//                }
                if (i == 6) {
                    thread2.join();
                }

            } catch (InterruptedException e) {
                System.out.println("catch interrupted exception");
            }
        }


    }
}

class ThreatJoin extends Thread {

    public ThreatJoin(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 30; i++){
            try {
                sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(getName() + " THREAD >> value >> " + i);
        }
    }



}