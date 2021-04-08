package com.hillel.lesson_07.H_E;

import java.util.Objects;

public class GE_dif {
    public static void main(String[] args) {
        User1 u1 = new User1();
        User2 u2 = new User2();

        System.out.println(u1.hashCode() == u2.hashCode());
        System.out.println(u1.equals(u2));
    }
}

class User1 {
    int i = 2;
    int j = 4;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User1 user1 = (User1) o;
        return i == user1.i &&
                j == user1.j;
    }

    @Override
    public int hashCode() {
        return Objects.hash(i, j);
    }
}

class User2 {
    int i = 2;
    int j = 5;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User1 user1 = (User1) o;
        return i == user1.i &&
                j == user1.j;
    }

    @Override
    public int hashCode() {
        return Objects.hash(i, j);
    }
}