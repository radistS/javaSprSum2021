package com.hillel.lesson_26.i18n;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;

public class Curency {
    public static void main(String[] args) {
        Locale loc =  Locale.CHINA;
        NumberFormat currFmt = NumberFormat.getCurrencyInstance(loc);
        currFmt.setCurrency(Currency.getInstance("EUR"));
        BigDecimal amt = BigDecimal.valueOf(123456.68504d).setScale(2, RoundingMode.HALF_DOWN);
        System.out.println(amt);
        System.out.println(currFmt.format(amt));
    }
}
