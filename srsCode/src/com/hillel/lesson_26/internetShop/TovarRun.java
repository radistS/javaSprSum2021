package com.hillel.lesson_26.internetShop;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.ResourceBundle;

public class TovarRun {

    private static Tovar tovar = new Tovar("name", "size", "color", 100);

    public static void main(String[] args) {
        Locale locale;
        if (args.length == 0)
            locale = new Locale("en", "US");
        else
            locale = new Locale(args[0], args[1]);
        ResourceBundle resourceBundle = ResourceBundle.getBundle("com.hillel.lesson_26.internetShop.tovar.tovar", locale);
        System.out.println(resourceBundle.getString(tovar.name));
        System.out.println(resourceBundle.getString(tovar.size));
        System.out.println(resourceBundle.getString(tovar.color));
        NumberFormat currFmt = NumberFormat.getCurrencyInstance(locale);
        if (locale.getCountry().equals("DE")){
            tovar.price = tovar.price * 0.9;}
        System.out.println(currFmt.format(tovar.price));
    }
}
