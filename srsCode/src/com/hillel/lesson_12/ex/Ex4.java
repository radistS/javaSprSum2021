package com.hillel.lesson_12.ex;

public class Ex4 {


    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("S1");
        StringBuilder sb2 = new StringBuilder("S2");
        StringBuilder sb3 = new Work().work(sb1, sb2);

        System.out.println("sb1 -> " + sb1);
        System.out.println("sb2 -> " + sb2);
        System.out.println("sb3 -> " + sb3);
    }
}

class Work {
    public StringBuilder work(StringBuilder a, StringBuilder b) {
        a = new StringBuilder("a");
        b.append("b");
        return a;
    }

//    public void upd(StringBuilder a, StringBuilder b) {
//        a.append("_upd");
//        b.append("_upd");
//    }
//
//    public void calc(Long a){
//       a = a +1;
//       a.hashCode();
//    }
}
