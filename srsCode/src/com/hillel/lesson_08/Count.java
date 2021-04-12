package com.hillel.lesson_08;

// Задана строка, состоящая из символов «(», «)», «[», «]», «{», «}».
// Проверить правильность расстановки скобок. Использовать стек.

import java.util.Arrays;
import java.util.Stack;

public class Count {
    public static void main(String[] args) {
        String str = "()[]{}()()[]{}";

        String[] sArray = str.split("");

        java.util.Stack<String> stack = new Stack<>();

        stack.addAll(Arrays.asList(sArray));

        System.out.println(stack);
        if (stack.size() % 2 == 0) {
            while (!stack.isEmpty()) {
                String v1 = stack.pop();
                String v2 = stack.pop();

                if ((v1.equals("]") && v2.equals("[")) ||
                        (v1.equals("}") && v2.equals("{")) ||
                        (v1.equals(")") && v2.equals("("))) {
                } else {
                    System.out.println("Incorrect");
                    break;
                }
            }
        } else {
            System.out.println("Incorrect");
        }
    }
}
