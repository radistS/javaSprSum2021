package com.hillel.lesson_14.task;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ChangeWordPlace {
    //5.   В каждом предложении текста поменять местами первое слово с последним, не изменяя
    //длины предложения.

    private static String EX = "1 2 3. 2 3 4. 3 4 5. 6 7";

    public static void main(String[] args) {


        System.out.println(EX);
        System.out.println();
        changeWordOrder(EX);
    }

    private static void changeWordOrder(String text) {
        String collect = Arrays.stream(text.split("\\."))
                .map(String::trim)
                .map(ChangeWordPlace::swap)
                .collect(Collectors.joining(". "));

        System.out.println(collect);
    }

    private static String swap(String str){
        String tmp;
        String[] s1 = str.split(" ");
        tmp = s1[0];
        s1[0] = s1[s1.length - 1];
        s1[s1.length - 1] = tmp;
        return String.join(" ", s1);
    }
}
