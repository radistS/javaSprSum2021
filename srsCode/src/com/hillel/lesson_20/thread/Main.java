package com.hillel.lesson_20.thread;
public class Main {
    public static void main(String[] args) {
        // Thread 1
        Thread threadTh = new ThreatTh("Thread 2"); // extend
        // Thread 2
        Thread threadRun = new Thread(new ThreadRun()); // implement


        threadRun.setName("Thread 3");

        System.out.println(Thread.currentThread().getName() + " start main");
        threadTh.start();
        threadRun.start();
        System.out.println(Thread.currentThread().getName() + " finish main");
    }
}
