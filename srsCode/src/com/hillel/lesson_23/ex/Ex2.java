package com.hillel.lesson_23.ex;

class Helper {
   public int data;
   public Helper() {
        this.data = 5;
    }
}

public class Ex2 {
    public static void main(String[] args) {
        Helper help = new Helper();
        System.out.println(help.data);
    }
}
