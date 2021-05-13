package com.hillel.lesson_13.streamExample.businessObject;


import com.hillel.lesson_13.streamExample.businessObject.enumerators.Sex;

public class User implements Comparable {

    private int id;
    private String firstName;
    private String lastName;
    private Integer age = 0;
    private Sex sex;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    private String fullName;

    public User() {
    }

    public User(int id, String firstName, String lastName, Integer age, Sex sex) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.sex = sex;
    }

    public User(String firstName) {
        this.firstName = firstName;
    }

    public User(String firstName, String lastName, Integer age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public void print() {
        System.out.println("User{" +
                "id=" + id +
                ", firstName='" + firstName +
                ", lastName='" + lastName  +
                ", age=" + age +
                ", sex=" + sex +
                '}');
    }

    public final String toString() {
        return "User{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                '}';
    }

    public void printUser(User user) {
        System.out.println(user.toString());
    }

    @Override
    public int compareTo(Object o) {
        if (o instanceof User) {
            User u = (User) o;
            return (this.firstName.compareTo(u.firstName));
        } else
            return -1;
    }
}
