package com.projects.example.hibernate.base.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "user")
@Setter
@Getter
@ToString
@Accessors(chain = true)
public class User{
    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "first_name")
    private String firstName;

    @Column(name="pasport_number", unique = true, length = 8)
    private String pasportNumber;

    @Column(name="phone", unique = true, length = 12)
    private String phone;

    @Column(name = "age")
    private Integer age;

    private Sex sex;

    @OneToOne
    @JoinColumn(name = "id")
    private Address address;

    @Transient
    private String fullName;

}
