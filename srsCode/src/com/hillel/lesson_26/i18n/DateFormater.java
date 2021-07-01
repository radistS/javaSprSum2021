package com.hillel.lesson_26.i18n;

import java.text.DateFormat;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;
import java.util.Locale;

public class DateFormater {
    public static void main(String[] args) {
        print("de");
        print("us");
        print("ru");
        print("fr");
        print("he");

//        ZoneId.getAvailableZoneIds().forEach(System.out::println);

        LocalDateTime ldt = LocalDateTime.now();
//        System.out.println(ldt.atZone(ZoneId.of("US/Pacific")));
    }

    private static void print(String loc) {
        DateFormat df = DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.SHORT, new Locale(loc));
        System.out.println(df.format(new Date()));
    }
}


