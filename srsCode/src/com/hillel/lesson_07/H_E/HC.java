package com.hillel.lesson_07.H_E;

import java.util.Objects;

public class HC {
    public static void main(String[] args) {
        User u1 = new User();
        User u2 = new User();

        System.out.println(u1.hashCode());
        System.out.println(u2.hashCode());
        System.out.println(u1.hashCode() == u2.hashCode());
        System.out.println(u1 == u2);

//        for (int i = 0; i <10; i++){
//            System.out.println(new User().hashCode());
//        }
    }
}

class User {
    private int i = 5;
    private int b = 10;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return i == user.i &&
                b == user.b;
    }

    @Override
    public int hashCode() {
        return Objects.hash(i, b);
    }
}
