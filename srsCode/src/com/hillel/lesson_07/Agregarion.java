package com.hillel.lesson_07;

public class Agregarion {
    public static void main(String[] args) {
        Radio1 radio = new Radio1("102.2 - Feel");

        Car1 car1 = new Car1(radio);

        System.out.println(car1.getRadio().getName());

        radio.setName("102.2 - Fell");

        System.out.println(car1.getRadio().getName());

        car1.getRadio().setName("My radio");

        System.out.println(car1.getRadio().getName());

    }
}

class Car1 {
    private Radio1 radio;

    public Car1(Radio1 radio1) {
        this.radio = radio1;
    }

    public Radio1 getRadio() {
        return radio;
    }
}

class Radio1 {
    private String name;

    public Radio1(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}