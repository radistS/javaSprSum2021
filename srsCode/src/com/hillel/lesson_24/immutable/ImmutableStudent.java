package com.hillel.lesson_24.immutable;

public final class ImmutableStudent {
    private final String firstName;
    private final String lastName;
    private final Integer age;

    public ImmutableStudent(String firstName, String lastName, Integer age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return new String(firstName);
    }

    public String getLastName() {
        return new String(lastName);
    }

    public Integer getAge() {
        return Integer.valueOf(age);
    }

    public ImmutableStudent setFirstName(String firstName) {
        return new ImmutableStudent(firstName, this.lastName, this.age);
    }
}
