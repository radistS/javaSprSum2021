package com.hillel.lesson_13.streamExample.businessObject.exception;

public class AgeException extends RuntimeException {

    private static final String MESSAGE = "Age less than 18. Access denied";

    public AgeException() {
        super(MESSAGE);
    }
}
