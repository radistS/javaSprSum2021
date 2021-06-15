package com.hillel.lesson_23.ex;

public class Ex4 {
    public static void main(String[] args) {
        int[] arr = {2, 1, 0};
        for (int i : arr) {
            System.out.print(arr[i]);
        }
        System.out.println();
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i]);
        }
    }
}
