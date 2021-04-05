package com.hillel.lesson_06;

public class Farm implements Cloneable {

    private  Animal animal;

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    @Override
    protected Farm clone() throws CloneNotSupportedException {
        return (Farm) super.clone();
    }
}
