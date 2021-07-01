package com.hillel.lesson_26.internetShop;

public class Tovar {
    String name;
    String size;
    String color;
    double price;

    public Tovar(String name, String size, String color, Integer price) {
        this.name = name;
        this.size = size;
        this.color = color;
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }
}
