package com.hillel.lesson_08.queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class QueueEx {
    public static void main(String[] args) {
        Deque<String> deque = new ArrayDeque<>();

        deque.add("one");
        deque.add("two");

        System.out.println(deque);

        deque.addFirst("1");
        deque.addLast("2");

        System.out.println(deque);
    }
}
