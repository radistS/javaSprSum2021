package com.hillel.lesson_07.tempConverter;

public interface TempConverter {
    default double convert(double value) {
        return value;
    }
}
