package com.pars;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Admin {
    private String firstName;
    private String lastName;
    private String email;
    private String permission;

}
