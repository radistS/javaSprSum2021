package com.projects.example.hibernate.base.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "Employees")
@Setter
@Getter
@Accessors(chain = true)
public class EmployeesShort {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private long id;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    private String email;

    @Override
    public String toString() {
        return  "firstName: " + firstName  +
                ", lastName: " + lastName  +
                ", email: " + email;
    }
}
