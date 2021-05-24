package com.hillel.lesson_16.gc;

public class Person {

    private String userName;

    Person(String userName) {
        this.userName = userName;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object PERSON: <<" + userName + ">>  --> remove from memory");
    }

    @Override
    public String toString() {
        return this.userName;
    }
}
