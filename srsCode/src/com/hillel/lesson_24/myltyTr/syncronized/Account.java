package com.hillel.lesson_24.myltyTr.syncronized;

public class Account implements Runnable {
    private int balance = 100;

    public int getBalance() {
        return balance;
    }

    public void getMoney(int amount) {
        balance -= amount;
    }

    public void run() {
        for (int x = 0; x < 6; x++) {
            getMoneyFromAccount(10);
            if (getBalance() < 0) {
                System.out.println("account is overdrawn!");
            }
        }
    }

    private synchronized void getMoneyFromAccount(int amount) {
        if (getBalance() >= amount) {
            System.out.println(Thread.currentThread().getName()
                    + " is going to get money");
            try {
                Thread.sleep(500);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
            getMoney(amount);
            System.out.println(Thread.currentThread().getName()
                    + " completes the get money operation. The balance is "
                    + getBalance());
        } else {
            System.out.println("Not enough in account for "
                    + Thread.currentThread().getName()
                    + " to get money " + getBalance());
        }
    }
}
