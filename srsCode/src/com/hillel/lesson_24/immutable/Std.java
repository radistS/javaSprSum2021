package com.hillel.lesson_24.immutable;

public class Std {
    public static void main(String[] args) {
        Student st = new Student();
        st.setAge(10);
        System.out.println(st);
        st1(st, 14);
        System.out.println(st);
        System.out.println(st2(st, 45));
    }

    static void st1(Student st, int age){
        st.setAge(age);
    }

    static Student st2(Student st, int age){
        st.setAge(age);
        return st;
    }
}
