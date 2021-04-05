package com.hillel.lesson_06.clas;

public class SOI {

    static class Inner {
        public void print() {
            System.out.println("Inner static class");
        }

        static class InnerInner {
            public void print() {
                System.out.println("InnerInner static class");
            }
        }
    }

    public static void main(String[] args) {
        Inner inner= new Inner();
        inner.print();

        Inner.InnerInner innerinner = new Inner.InnerInner();
        innerinner.print();
    }

}
