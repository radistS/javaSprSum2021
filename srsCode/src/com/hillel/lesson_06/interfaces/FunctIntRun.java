package com.hillel.lesson_06.interfaces;

public class FunctIntRun {
    public static void main(String[] args) {
        FunctInt fi = (srt) -> System.out.println(srt.toUpperCase());

        fi.print("aaaa");
        fi.print("bbb");
        fi.print("cccc");
        fi.print("ssss");

    }
}
