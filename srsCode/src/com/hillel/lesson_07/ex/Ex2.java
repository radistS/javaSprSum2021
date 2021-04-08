package com.hillel.lesson_07.ex;

public class Ex2 {
    public static void main(String[] args) {
        boolean keepGoing = true;
        int result = 15;
        int i = 10;
        do {
            i--; // 9 -> 8
            if (i == 8) keepGoing = false;
            result -= 2; // 13 -> 11
        } while (keepGoing); // false -> true
        System.out.println(result);
    }
}
