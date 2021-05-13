package com.hillel.lesson_14.java8;

import com.hillel.lesson_13.streamExample.businessObject.User;

public class
Calculate  {
    public static void main(String[] args) {
        Operation operation = (x) -> {
                int y = x * x;
                return y;
        };

        operation = (x) -> x * x;

        int result = operation.calculate(10);
        System.out.println(operation.calculate(12));
        System.out.println(result); //30
        Operation operation1 = (x) -> {
            int a = x;
            return a;
        };





        Print print = () -> System.out.println("Test");
        print.print();

//        System.out.println(operation.calculate(13));

        User uz = new User();

        Usr usr = (u) -> uz;

    }
}

@FunctionalInterface
interface Operation {
    int calculate(int x);
}

@FunctionalInterface
interface Print {
    void print();
}


@FunctionalInterface
interface Usr {
    User mod(User user);
}

