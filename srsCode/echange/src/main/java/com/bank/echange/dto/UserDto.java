package com.bank.echange.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class UserDto {
    private Long id;
    private String firstName;
    private String lastName;
    private String phone;
}
