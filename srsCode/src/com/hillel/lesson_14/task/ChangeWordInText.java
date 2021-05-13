package com.hillel.lesson_14.task;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ChangeWordInText {
    //16.  В некотором предложении текста слова заданной длины заменить указанной подстрокой,
    //длина которой может не совпадать с длиной слова.

    static String TEXT = "test_word";
    static String TEXT_EXAMPLE = "test word 231 3465435 345345 234 1245 3456 12345243 q345234";


    public static void main(String[] args) {

        System.out.println(TEXT_EXAMPLE);
        System.out.println(Arrays.stream(TEXT_EXAMPLE.split(" ")).map(e ->
            e.length() == 4 ? TEXT : e
        ).collect(Collectors.joining(" ")));


    }
}
