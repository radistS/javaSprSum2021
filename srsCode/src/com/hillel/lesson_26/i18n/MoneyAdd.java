package com.hillel.lesson_26.i18n;

import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;

public class MoneyAdd {
    public static void main(String[] args) {
        NumberFormat dollarFormatter = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat euroFormatter = NumberFormat.getCurrencyInstance(Locale.GERMANY);
        dollarFormatter.setCurrency(Currency.getInstance("USD"));

        int amount = 100000;
        System.out.println(dollarFormatter.format(amount));
        System.out.println(euroFormatter.format(amount));
    }
}
