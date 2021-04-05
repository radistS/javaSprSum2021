package com.hillel.lesson_06.absrt;

public class Student extends Human {
    private String group;

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    @Override
    void print() {

    }

    @Override
    public String toString() {
        super.toString();
        return "Student{" +
                "name='" + super.getName() + '\'' +
                ", age=" + super.getAge() +
                ", group='" + group + '\'' +
                '}';
    }
}
