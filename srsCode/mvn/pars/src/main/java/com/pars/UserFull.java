package com.pars;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserFull extends UserExt {
    private String firstName;
    private String lastName;
    private int age;
    private String email;
    private String technology;
    private boolean active;
    private List<Contact> contact;
    private Address address;
}
