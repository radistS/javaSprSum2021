package com.hillel.lesson_20.syn;

public class Count {

    private volatile static int count = 100;

    public synchronized static void increment(int amount) {
        count += amount;
    }

    public synchronized static void setCount(int count) {
        Count.count = count;
    }

    public synchronized static void decrement(int amount) {
        count -= amount;
    }

    public synchronized static int getCount() {
        return count;
    }
}
