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
@Table(name = "address")
@Setter
@Getter
@ToString
@Accessors(chain = true)
public class Address {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;

    @Column(name = "zip_code", length = 5)
    private String zipCode;

    @Column(name = "country", nullable = false)
    private String country;

    @Column(name = "city")
    private String city;

    @Column(name = "street")
    private String street;

    private String flat;

}
