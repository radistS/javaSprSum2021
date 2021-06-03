package com.hillel.lesson_20.singletone;

import lombok.SneakyThrows;

public class Main {
    @SneakyThrows
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance("foo");
        System.out.println(singleton.value);
        System.out.println(singleton.hashCode());
        singleton = null;
        System.gc();
        Thread.sleep(10_000);
        Singleton anotherSingleton = Singleton.getInstance("bar");
        System.out.println(anotherSingleton.value);
        System.out.println(anotherSingleton.hashCode());
    }
}
