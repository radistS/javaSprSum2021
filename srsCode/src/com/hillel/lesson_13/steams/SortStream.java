package com.hillel.lesson_13.steams;

import com.hillel.lesson_13.RandomGenerator;

public class SortStream {
    public static void main(String[] args) {

        generateSequence(100)
                .stream()
                .sorted(Comparator.comparing(U::getA).thenComparing(Comparator.comparing(U::getB)))
                .map(u -> {
                    u.setB(RandomGenerator.getSringValue(1) + u.getB());
                    return u;
                })
                .sorted(Comparator.comparing(U::getA).thenComparing(U::getB))
                .forEach(System.out::println);

        Map<String, String> collect = generateSequence(5)
                .stream().collect(Collectors.toMap(U::getA, U::getB));

        System.out.println(collect);

    }

    private static List<U> generateSequence(int count){
        List<U> u = new ArrayList<>(count);
        for (int i = 0; i < count; i++)
            u.add(new U(RandomGenerator.getSringValue(1),
                    RandomGenerator.getSringValue(2)));
    return u;
    }
}

class U {
    private String a;
    private String b;

    public U(String a, String b) {
        this.a = a;
        this.b = b;
    }

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
    }

    @Override
    public String toString() {
        return "U{" +
                "a='" + a + '\'' +
                ", b='" + b + '\'' +
                '}';
    }
}
