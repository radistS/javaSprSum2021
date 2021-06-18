package com.hillel.lesson_24.myltyTr.raceCondition;

public class Transaction {
    public synchronized static void main(String[] args) {
        Account account = new Account();
        Thread one = new Thread(account);
        Thread two = new Thread(account);
        one.setName("Kate");
        two.setName("Jon");
        one.start();
        two.start();
    }
}
