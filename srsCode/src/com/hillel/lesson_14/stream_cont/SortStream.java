package com.hillel.lesson_14.stream_cont;

import java.util.Comparator;
import java.util.Objects;
import java.util.stream.Stream;

public class SortStream {
    public static void main(String[] args) {

        Stream.of(1,3,4,2,9,5,6,1,5)
                .sorted()
                .forEach(e -> System.out.print(e + " "));


        System.out.println();

        Stream.of(
                new Dig(5, "g"),
                new Dig(1, "a"),
                new Dig(4, "r"),
                new Dig(9, "e"),
                new Dig(2, "b"))
                .sorted(Comparator.comparing(Dig::getName))
//                .sorted(Comparator.comparing(Dig::getValue))
                .forEach(e -> System.out.println(e));

    }
}

class Dig{
    int value;
    String name;

    public Dig(int value, String name) {
        this.value = value;
        this.name = name;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Dig{" +
                "v -> " + value +
                ", name -> " + name +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dig dig = (Dig) o;
        return value == dig.value &&
                Objects.equals(name, dig.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value, name);
    }
}
