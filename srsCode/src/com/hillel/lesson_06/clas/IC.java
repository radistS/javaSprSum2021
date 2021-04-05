package com.hillel.lesson_06.clas;

public class IC {
    public static void main(String[] args) {
        IC.print();
        IC.println();
    }

    static void println() {
        System.out.println("Метод внешнего класса");

        Integer o = 1;
        class Inner implements Logger {

            Integer i = 2;

            @Override
            public void log(String st) {
                System.out.println(i);
                System.out.println(o);
                System.out.println(String.format("[INFO] message  1: %s", st));
            }
        }



        class I1 extends Inner{

        }

        new I1().log("I1");
        new Inner().log("1");
        new Inner().log("2");
        new Inner().log("3");
        new Inner().log("4");

    }

    static void print() {
        System.out.println("Метод внешнего класса");

        class Inner implements Logger {

            @Override
            public void log(String st) {
                System.out.println(String.format("[WARN] message 2: %s", st));
            }
        }
        new Inner().log("1");
        new Inner().log("2");
        new Inner().log("3");
        new Inner().log("4");

    }
}
