package com.hillel.lesson_30.ex;

class MyLink{
    public MyLink(){
        str = "New";
    }
    public String str;
}

public class Test4{
    public static void main(String[] args) {
        MyLink b1 = new MyLink();
        System.out.println(b1.str);
        MyLink b2 = b1;
        System.out.println(b1.str);
        b2.str = "MyString";
        System.out.println(b1.str);

        String a1 = "Test";
        String a2 = a1;
        System.out.println(a2);
        a1 = "Not a Test";
        System.out.println(a2);
    }
}