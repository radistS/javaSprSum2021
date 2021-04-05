package com.hillel.lesson_06.interfaces.logExample;

public class Transport implements Logger {
    private String timetable;

    @Override
    public void printLog(String msg) {
        System.out.println("Transport : " + timetable + " ... " + msg);
    }

    @Override
    public String xxx() {
        return null;
    }
}
