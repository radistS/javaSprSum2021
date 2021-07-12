package com.spring;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@Setter
@Getter
@ToString
public class User {
    private static final String START = "create been -> %s";
    private static final String STOP = "destroy bean -> %s";

    private String firstName;
    private String lastName;
    private Long date;

    public void start() {
        this.firstName = "ivan";
        this.lastName = "ivanov";
//        this.date = Double.valueOf(new Date().getTime());
        System.out.println(String.format(START, this.getClass().getName()));
    }

    public void stop() {
        System.out.println(String.format(STOP, this.getClass().getName()));
    }
}
