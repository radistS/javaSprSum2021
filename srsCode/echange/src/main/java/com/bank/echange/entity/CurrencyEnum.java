package com.bank.echange.entity;

public enum CurrencyEnum {
    UAH ("UAH"), USD ("USD"), EUR ("EUR");

    private String cur;

    CurrencyEnum(String cur) {
        this.cur = cur;
    }

    public String cur() {
        return cur;
    }
}
