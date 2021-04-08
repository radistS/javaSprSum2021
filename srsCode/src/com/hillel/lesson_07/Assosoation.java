package com.hillel.lesson_07;

public class Assosoation {
    public static void main(String[] args) {
        Car2 car  = new Car2();

        System.out.println(car.getRadio());

        Radio2 radio2 = new Radio2("BMW");

        car.setRadio(radio2);

        System.out.println(car.getRadio().getName());
    }
}

class Car2 {
    private Radio2 radio;

    public Car2() {
    }

    public Radio2 getRadio() {
        return radio;
    }

    public void setRadio(Radio2 radio) {
        this.radio = radio;
    }
}

class Radio2 {
    private String name;

    public Radio2(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}