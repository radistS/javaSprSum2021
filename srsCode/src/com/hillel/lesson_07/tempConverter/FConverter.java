package com.hillel.lesson_07.tempConverter;

public class FConverter implements TempConverter {
    @Override
    public double convert(double value) {
        return 1.8 * value + 32;
    }
}
