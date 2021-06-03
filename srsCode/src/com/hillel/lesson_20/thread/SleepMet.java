package com.hillel.lesson_20.thread;

import java.util.concurrent.TimeUnit;

public class SleepMet {
    public static void main(String[] args) throws InterruptedException {
//        List<String> arrStr = Arrays.asList("one", "two", "three", "four");
//        List<String> arrStr1 = List.of("one", "two", "three", "four"); // immutable
//
//        System.out.println(arrStr1.getClass());
//
//        arrStr1.add(0, "ddd");
//
//        for (String str : arrStr){
//            Thread.sleep(4000);
//            System.out.println(str);
//        }

//        for (int i =0; i < 10; i++){
//            System.out.print("#");
//            Thread.sleep(1000);
//        }

        int attempt = 10;
        for (int i = 1; i <= attempt; i++){
            TimeUnit.SECONDS.sleep(i);
            System.out.println("Sleep (s): " + i);
        }


//        Thread thread = new ThreatTh("parallel thread");
//
//        System.out.println(thread.getName());
//        System.out.println(thread.getId());
//        thread.start();
//
//        for (int i = 0; i < 20; i++) {
//            Thread.sleep(1500);
//            System.out.println("MAIN >> value >> " + i);
//        }


    }
}
