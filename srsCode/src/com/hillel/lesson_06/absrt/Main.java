package com.hillel.lesson_06.absrt;

public class Main {
    public static void main(String[] args) {

//        Human h = new Human();

        Student student = new Student();
        student.setName("Ivan Ivanov");
        student.setAge(18);
        student.setGroup("qwerty");

        Teacher teacher = new Teacher();
        teacher.setName("Mariya Ivanovna");
        teacher.setSalary(100000);
        teacher.setAge(45);

        System.out.println(student);
        System.out.println(teacher);

        Human t2 = new Teacher();

    }
}
