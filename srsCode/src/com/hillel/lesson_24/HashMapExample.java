package com.hillel.lesson_24;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class HashMapExample {
    public static void main(String[] args) {

        Map<St, Integer> map =  new HashMap();
        St st1 = new St(5, 5);
        System.out.println(st1.hashCode());
        map.put(st1, 10);
        System.out.println(map.get(st1));
        st1.a = 10;
        System.out.println(st1.hashCode());
        System.out.println(map.get(st1));

        for (St s : map.keySet()){
            System.out.println(map.get(s));
        }

    }
}

class St{
    int a;
    int b;

    public St(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        St st = (St) o;
        return a == st.a &&
                b == st.b;
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, b);
    }
}