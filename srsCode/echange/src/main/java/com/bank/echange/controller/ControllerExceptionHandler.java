package com.bank.echange.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ControllerExceptionHandler {
    private final String MESSAGE = "User not found by ";

//    @ExceptionHandler(value = {UserNotFoundException.class})
//    public ResponseEntity<?> handleInvalidTopUpTypeException(Exception ex) {
//        return new ResponseEntity(ex.getMessage(), HttpStatus.BAD_REQUEST);
//
//    }
}
