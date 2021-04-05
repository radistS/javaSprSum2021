package com.hillel.lesson_06;

public class MainPet {
    public static void main(String[] args) throws CloneNotSupportedException {
        Pet pet = new Pet("Barsik", 10);

        System.out.println(pet.getAge());
        System.out.println(pet.getName());

        Pet petClone = (Pet) pet.clone();

        System.out.println(petClone.getAge());
        System.out.println(petClone.getName());

        Farm farm = new Farm();
        farm.setAnimal(new Animal());

        System.out.println(farm.toString());
        System.out.println(farm.getAnimal().toString());

        Farm farmC = farm.clone();

        System.out.println(farmC.toString());
        System.out.println(farmC.getAnimal().toString());
    }
}
