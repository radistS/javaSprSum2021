package com.hillel.lesson_21.ex;

public class ex1 {
    Integer num = 100;
    public void calc(Integer num)  { this.num = num * 10; }
    public void printNum()     { System.out.println(num); }

    public static void main(String[] args)
    {
        ex1 obj = new ex1();
        obj.calc(2);
        obj.printNum();
    }
}

