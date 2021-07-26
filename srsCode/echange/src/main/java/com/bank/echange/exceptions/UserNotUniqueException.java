package com.bank.echange.exceptions;

public class UserNotUniqueException extends RuntimeException{
    public UserNotUniqueException(String message) {
        super(message);
    }
}
