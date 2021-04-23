package com.hillel.lesson_11;

public class UpperCaseCount{
    private static final String text = "as As bd Bs Gs ss FR nn HY bbyy Mr";

    public static void main(String[] args) {
        int cont = 0;

        for(String s : text.split(" ")){
            if (s.substring(0, 1).equals(s.substring(0, 1).toUpperCase())) cont++;
        }
        System.out.println(cont);

    }

}
