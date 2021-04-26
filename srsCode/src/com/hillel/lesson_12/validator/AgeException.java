package com.hillel.lesson_12.validator;

public class AgeException extends RuntimeException {

    private static final String VALID_MESSAGE = "Age < 18, your age %s";
    public AgeException(String message) {
        super(String.format(VALID_MESSAGE, message));
    }
}
