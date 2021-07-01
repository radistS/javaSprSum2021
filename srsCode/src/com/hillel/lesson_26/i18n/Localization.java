package com.hillel.lesson_26.i18n;

import java.util.Locale;

public class Localization {
    public static void main(String[] args) {
        Locale locale = new Locale("ru", "UA");
        System.out.println(locale.getDisplayLanguage());
        System.out.println(locale.getDisplayName());


        Locale defaultLocale = Locale.getDefault();
        System.out.println(defaultLocale.getDisplayLanguage());
        System.out.println(defaultLocale.getDisplayName());

        Locale.setDefault(Locale.CHINESE);
        System.out.println(defaultLocale.getDisplayLanguage());
        System.out.println(defaultLocale.getDisplayName());

        Locale.setDefault(Locale.GERMANY);
        System.out.println(defaultLocale.getDisplayLanguage());
        System.out.println(defaultLocale.getDisplayName());

    }
}
