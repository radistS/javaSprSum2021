package com.hillel.lesson_06.clas;

public class OI {

    String str = "Outer";

    private String st = "Otter private";

    public class Inner {
        private String str = "ssss";
        public void print() {
            System.out.println("hello from inner class");
            System.out.println(st);
        }

        public class InnerInner {
            public void print() {
                System.out.println("hello from innerinner class");
                System.out.println(str);
                System.out.println(st);
            }
        }
    }

    public static void main(String[] args) {
        Inner.InnerInner inner = new OI().new Inner().new InnerInner();
        inner.print();
//        System.out.println(inner);
    }
}
