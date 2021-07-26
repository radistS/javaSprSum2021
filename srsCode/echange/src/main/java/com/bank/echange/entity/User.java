package com.bank.echange.entity;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * -- auto-generated definition
 * create table user
 * (
 *     id         int auto_increment
 *         primary key,
 *     first_name varchar(255) null,
 *     last_name  varchar(255) null,
 *     phone      varchar(255) null
 * );
 */
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
@Accessors(chain = true)
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    private String phone;

}
