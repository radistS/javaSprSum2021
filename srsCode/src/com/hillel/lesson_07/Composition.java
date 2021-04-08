package com.hillel.lesson_07;

public class Composition {
    public static void main(String[] args) {
        Car car1 = new Car("Prosto");
        Car car2 = new Car("Narodnoe");

        System.out.println(car1.getRadio().getName());
        System.out.println(car2.getRadio().getName());

        car1.getRadio().setName("Feel");

        System.out.println(car1.getRadio().getName());
        System.out.println(car2.getRadio().getName());
    }

}

class Car {
    private Radio radio;

    public Car(String name) {
        this.radio = new Radio(name);
    }

    public Radio getRadio() {
        return radio;
    }
}

class Radio {
    private String name;

    public Radio(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}