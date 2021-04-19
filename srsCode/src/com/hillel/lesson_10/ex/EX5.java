package com.hillel.lesson_10.ex;

public class EX5 {
    public static void main(String[] args) {
        String o = "-";

        System.out.println("FRED".toLowerCase().substring(1, 3));

        switch ("FRED".toLowerCase().substring(1, 3)) {
            case "yellow":
                o += "y";
            case "red":
                o += "f";
            case "green":
                o += "g";
        }
        System.out.println(o);
    }
}
