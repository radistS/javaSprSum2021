package com.hillel.lesson_20.syn;

public class Main {
    public static void main(String[] args) {
        Runnable task1 = () -> {
            for (int i = 0; i < 5; i++){
                int j = Count.getCount();
                System.out.println(">> TH-1 : " + j);
                try {
                    Thread.sleep(750);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                j += 23;
                Count.setCount(j);
                System.out.println("<< TH-1 : " + Count.getCount());
            }

        };
//        Runnable task2 = () -> {
//
//            for (int i = 0; i < 2; i++){
//                System.out.println(">> TH-2 : " + Count.getCount());
//                Count.decrement(80);
//                System.out.println("<< TH-2 : " + Count.getCount());
//            }
//
//
//        };

        new Thread(task1).start();
//        new Thread(task2).start();

        for (int i = 0; i < 10; i++){
            try {
                System.out.println(Count.getCount());
                Thread.sleep(500);
                Count.increment(25);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Count.getCount());
        }



        System.out.println(Count.getCount());
    }
}
