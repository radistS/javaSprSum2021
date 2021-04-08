package com.hillel.lesson_07.diamond;

public class Print implements Interface1, Interface2 {
    @Override
    public void print() {
        Interface1.super.print();
    }

//    @Override
//    public void print1() {
//        System.out.println("print");
//    }
//
//    @Override
//    public void print2() {
////        System.out.println("print 2");
//        Interface2.super.print2();
//    }
//
//    @Override
//    public void print3() {
//
//    }
//
//    @Override
//    public void print3(String str) {
//
//    }
//    public void print3(String str, String Str1) {
//
//    }
}