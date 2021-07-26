package com.bank.echange.exceptions;

public class NotEnoughtMoneyException extends RuntimeException{
    public NotEnoughtMoneyException(String message) {
        super(message);
    }
}
