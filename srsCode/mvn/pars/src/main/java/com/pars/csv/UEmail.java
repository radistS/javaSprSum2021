package com.pars.csv;

import com.opencsv.bean.CsvBindByName;
import lombok.Data;

@Data
public class UEmail {
    @CsvBindByName(column = "Username")
    private String userName;
    @CsvBindByName(column = "Login email")
    private String loginEmail;
    @CsvBindByName(column = "Identifier")
    private String identifier;
    @CsvBindByName(column = "First name")
    private String firstName;
    @CsvBindByName(column = "Last name")
    private String LastName;

}
