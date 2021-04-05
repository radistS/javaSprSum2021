package com.hillel.lesson_06.interfaces.logExample;

public class User implements Logger {
    private String fullName;

    @Override
    public void printLog(String msg) {
        System.out.println("User : " + fullName + " ... " + msg);
    }

    @Override
    public String xxx() {
        return null;
    }
}
