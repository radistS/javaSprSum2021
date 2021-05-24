package com.hillel.lesson_16.classLoader;

public class ClassLoaderRun {

    public static void main(String[] args) {
        try {
            Class clazz = Student.class;
            System.out.println(clazz.getSimpleName());
            System.out.println(clazz.getClassLoader());
            System.out.println();

            Class clazzStudent = new CustomClassLoader().findClass("Student");
            System.out.println(clazzStudent.getSimpleName());
            System.out.println(clazzStudent.getClassLoader());
            System.out.println();

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
