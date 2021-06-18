package com.hillel.lesson_24.ex;

import java.math.BigDecimal;

public class ex6 {
    public static void main(String[] args) {
        System.out.println(0.3 == 0.2 + 0.1);
        System.out.println(0.2 + 0.1);
        System.out.println(0.3 / (0.2 + 0.1));

        BigDecimal a1 = BigDecimal.valueOf(0.04d);
        BigDecimal a2 = BigDecimal.valueOf(0.04d);
        System.out.println(a1.divide(a2));

        System.out.println(0.11 / 0.11);

        double d = 0.3;
        System.out.println(d /d);
    }
}
