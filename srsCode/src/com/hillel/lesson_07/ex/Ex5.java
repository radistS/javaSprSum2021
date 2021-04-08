package com.hillel.lesson_07.ex;

public class Ex5 {
    public static void main(String[] args) {
        int myGold = 7;
        System.out.println(new Hobbit().countGold(myGold, 6));
    }
}

class Hobbit {
    int countGold(int x, int y) {
        return x + y;
    }
}
