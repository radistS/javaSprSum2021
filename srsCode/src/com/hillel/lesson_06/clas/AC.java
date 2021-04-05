package com.hillel.lesson_06.clas;

public class AC {
     Demo demo = new Demo() {
        @Override
        void print() {
            System.out.println("AC");
        }
    };

    public static void main(String[] args) {
        AC ac = new AC();

        ac.demo.print();

        int a = 10;

        Demo demoQ = new Demo() {
            @Override
            void print() {
                System.out.println("kjfdnslkbms'fdlk");
            }
        };


        demoQ.print();
    }
}

class Demo {
    void print() {
        System.out.println("Demo");
    }
}
