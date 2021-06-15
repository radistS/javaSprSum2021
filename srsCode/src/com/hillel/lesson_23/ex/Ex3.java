package com.hillel.lesson_23.ex;

class Base {
    private int data;

    public Base() {
        data = 5;
    }

    public int getData() {
        return data;
    }
}

class Ex3 extends Base {
    private int data;

    public Ex3() {
        data = 6;
    }

    public int getData() {
        return data;
    }

    public static void main(String[] args) {
        Ex3 myData = new Ex3();
        System.out.println(myData.getData());
        System.out.println(myData.data);
    }
}
