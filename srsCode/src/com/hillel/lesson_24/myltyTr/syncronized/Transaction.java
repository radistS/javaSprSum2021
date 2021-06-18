package com.hillel.lesson_24.myltyTr.syncronized;

import static java.lang.Thread.MAX_PRIORITY;
import static java.lang.Thread.MIN_PRIORITY;

public class Transaction {
    public static void main(String[] args) throws InterruptedException {
        Account account = new Account();
        Thread one = new Thread(account);
        Thread two = new Thread(account);
        two.setPriority(MAX_PRIORITY);
        one.setPriority(MIN_PRIORITY);
        one.setName("Jon");
        two.setName("Kate");
        one.start();
        Thread.sleep(100);
        two.start();
    }
}
