package com.hillel.lesson_05.transport;

public abstract class Transport {
    public Transport(String name) {
        this.name = name;
    }

    private int speed;
    private int weight;
    private String name;

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
