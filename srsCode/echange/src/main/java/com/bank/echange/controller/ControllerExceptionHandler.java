package com.bank.echange.controller;

import com.bank.echange.exceptions.NotEnoughtMoneyException;
import com.bank.echange.exceptions.UserNotFoundException;
import com.bank.echange.exceptions.UserNotUniqueException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ControllerExceptionHandler {

    @ExceptionHandler(value = {
            UserNotFoundException.class,
            UserNotUniqueException.class,
            NotEnoughtMoneyException.class})
    public ResponseEntity<?> handleInvalidTopUpTypeException(Exception ex) {
        return new ResponseEntity(ex.getMessage(), HttpStatus.BAD_REQUEST);

    }
}
