package com.hillel.lesson_06;

public class CloneMain {
    public static void main(String[] args) throws CloneNotSupportedException {
        CloneTest c1 = new CloneTest(12);

        CloneTest c2 = (CloneTest) c1.clone();

        CloneTest c3 = c1;

        System.out.println(c1.i);
        System.out.println(c2.i);
        System.out.println(c3.i);

        System.out.println("----------");

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);

        c3.i = 13;

        System.out.println(c1.pet);
        System.out.println(c2.pet);
        System.out.println(c3.pet);
        System.out.println(c1.pet.getName());
        System.out.println(c2.pet.getName());
        System.out.println(c3.pet.getName());

        c2.pet.setName("123");

        System.out.println(c1.pet.getName());
        System.out.println(c2.pet.getName());
        System.out.println(c3.pet.getName());
    }
}
