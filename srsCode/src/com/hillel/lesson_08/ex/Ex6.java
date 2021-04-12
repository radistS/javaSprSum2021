package com.hillel.lesson_08.ex;

public class Ex6 {
    final static short x = 2;
    public static int y = 0;

    public static void main(String[] args) {
        for (int z =0; z < 3; z++){
//            System.out.println("z = " + z);
            switch (z){
                case x:  System.out.print("0 ");
                case x - 1: System.out.print("1 ");
                case x - 2: System.out.print("2 ");
//                default:
//                    System.out.print("default ");

                    System.out.println();
            }
        }
    }

}
