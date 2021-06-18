package com.hillel.lesson_24.ex;

public class ex5 {
    public static void main(String[] args) {
        int [] arr1 = { 1 , 2 , 3 };
        int [] arr2 = { 'A' , 'B' };
        arr1 = arr2;
        for ( int i = 0 ; i < arr1.length; i++) {
            System. out .print((char) arr1[i] + " " );
        }
        System.out.println();
        for ( int i = 0 ; i < arr1.length; i++) {
            System. out .print( arr1[i] + " " );
        }
    }
}
