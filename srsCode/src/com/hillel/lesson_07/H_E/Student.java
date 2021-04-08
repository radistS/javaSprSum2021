package com.hillel.lesson_07.H_E;

import java.util.Objects;

public class Student {
    String name;
    String fullName;
    Integer age;
    int i;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return i == student.i &&
                Objects.equals(name, student.name) &&
                Objects.equals(fullName, student.fullName) &&
                Objects.equals(age, student.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, fullName, age, i);
    }
}
