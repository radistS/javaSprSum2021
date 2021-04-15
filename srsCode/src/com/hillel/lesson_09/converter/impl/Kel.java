package com.hillel.lesson_09.converter.impl;

import com.hillel.lesson_09.converter.Converter;

public class Kel implements Converter {
    @Override
    public int convert(int value) {
        return value + 273;
    }
}
