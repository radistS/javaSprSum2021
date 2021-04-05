package com.hillel.lesson_06.ex;

public class Ex1 {
    public static void main(String[] args) {
        Salmon s = new Salmon();
        System.out.println(s.getCount());
        System.out.println(s.count);
    }
}

class Salmon{
    int count; // private

    public Salmon() {
        count = 4;
    }

    public int getCount() {
        return count;
    }
}
