package com.hillel.lesson_26.ex;

public class Test4 {
    public static void main(String[] args) {
//        int[] x = new int[3];
        Integer[] x = new Integer[3];
        System.out.println("x[0] is " + x[0]);
        for (int i = 0; i < x.length; i++){
            System.out.println(x[i]);
        }
        for (int i : x){
            System.out.print(i);
        }
    }
}
