package com.hillel.lesson_06.clas;

import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        new A().getAndPrintClassName();


        System.out.println(new B().compare2values(1,2));
    }
}


class A {
    String getAndPrintClassName(){
        class Prtn implements PrintInfo {
            @Override
            public void print(String message) {
                System.out.println("print message : " + message);
            }
        }

        new Prtn().print(getClass().getName());
        return "";}
}

class B {
    int compare2values(Integer o1, Integer o2){
        class Comp implements Comparator<Integer> {

            @Override
            public int compare(Integer o1, Integer o2) {
                if (o1 < o2) return -1;
                if (o1.equals(o2)) return 0;
                return 1;
            }
        }

        return new Comp().compare(o1, o2);
    }
}