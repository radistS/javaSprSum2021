package com.pars.csv;

import com.opencsv.bean.CsvBindByName;
import com.opencsv.bean.CsvBindByPosition;
import lombok.Data;

@Data
public class UEmail_ {
    @CsvBindByPosition(position = 0)
    private String userName;
    @CsvBindByPosition(position = 1)
    private String loginEmail;
    @CsvBindByPosition(position = 2)
    private String identifier;
    @CsvBindByPosition(position = 3)
    private String firstName;
    @CsvBindByPosition(position = 4)
    private String LastName;

}
