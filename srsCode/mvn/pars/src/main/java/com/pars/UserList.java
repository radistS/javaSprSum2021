package com.pars;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Data
@NoArgsConstructor
public class UserList {
    private List<UserLittle> users;
}
