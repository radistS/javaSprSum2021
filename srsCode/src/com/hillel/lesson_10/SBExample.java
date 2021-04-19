package com.hillel.lesson_10;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

public class SBExample {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");

        sb.append(simpleDateFormat.format(new Date())).append(" >>> ");

        if (args.length > 0 && args[0].equals("1")) {
            sb.append("1");
        } else {
            sb.append("2");
        }

        System.out.println(sb);

        System.out.println(String.format("Test %s text %s","aaa", "bbb"));

        StringBuilder sb1 = sb;

        System.out.println(sb1);
        System.out.println(sb);

        sb1.append("dddd");

        System.out.println(sb1);
        System.out.println(sb);

    }
}
