package com.hillel.lesson_10;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class UserSet {
    public static void main(String[] args) {

        Set<UserH> s = new HashSet<>();

        System.out.println(s.add(new UserH(1, "Ivan", "Ivanov")));
        System.out.println(s.add(new UserH(1, "Ivan1", "Ivanov")));
        System.out.println(s.add(new UserH(1, "Ivan2", "Ivanov")));
        System.out.println(s.add(new UserH(2, "Ivan2", "Ivanovaaaa")));

        System.out.println(s);
    }
}

final class UserH {
    Integer age;
    String name;
    String surname;


    public UserH(Integer age, String name, String surname) {
        this.age = age;
        this.name = name;
        this.surname = surname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserH userH = (UserH) o;
        return Objects.equals(age, userH.age) &&
                Objects.equals(name, userH.name) &&
                Objects.equals(surname, userH.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name, surname);
    }

    @Override
    public String toString() {
        return "UserH{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}
