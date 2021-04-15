package com.hillel.lesson_09.ex;

public class Ex3 {
    public static void main(String[] args) {
        Days d1 = Days.TH;
        Days d2 = Days.M;

        for (Days d : Days.values()) {
            if (d.equals(Days.F)) break;
            d2 = d;
        }
        System.out.println((d1 == d2) ? "same" : "not same");

        Days a = Days.S;
        Days a1 = Days.S;

        System.out.println(a == a1);
        System.out.println(a.equals(a1));
    }
    enum Days {M, T, W, TH, F, SA, S}
}
