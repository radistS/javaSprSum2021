package com.hillel.lesson_31.ex;

class Ex4
{

    public static void main(String[] args) {
        Ex4_1 ex = new Ex4_1();

        ex.method(1);
        ex.method(2);
        ex.method(Integer.valueOf(1));


    }
    @Deprecated
    void method(int i)
    {

    }
}

class Ex4_1 extends Ex4{
    void method(int i) {
        System.out.println("int");
    }

    void method(Integer i){
        System.out.println("Integer");
    };
}