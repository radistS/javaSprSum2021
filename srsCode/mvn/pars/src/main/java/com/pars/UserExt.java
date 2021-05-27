package com.pars;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserExt extends User {
    private String firstName;
    private String lastName;
    private int age;
    private String email;
    private String technology;
    private Identifiers identifiers;
    private boolean active;
}
