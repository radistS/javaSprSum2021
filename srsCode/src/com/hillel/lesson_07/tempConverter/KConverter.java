package com.hillel.lesson_07.tempConverter;

public class KConverter implements TempConverter {
    @Override
    public double convert(double value) {
        return value + 273;
    }
}
