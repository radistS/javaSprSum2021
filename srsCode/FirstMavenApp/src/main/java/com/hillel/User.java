package com.hillel;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

@ToString
@AllArgsConstructor
@Builder
@Accessors(chain = true)
@NoArgsConstructor
public class User {
    @Setter
    private String name;
    @Setter
    @Getter
    private String email;
    @Setter
    @ToString.Exclude
    private String phone;
    @EqualsAndHashCode.Exclude
    private Integer age;
}
