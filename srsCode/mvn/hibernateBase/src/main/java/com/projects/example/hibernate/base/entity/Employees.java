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


/*
create table hillelTest.employees
(
	id int auto_increment,
	first_name varchar(255) null,
	last_name varchar(255) null,
	sex enum('M', 'F') null,
	age int null,
	email varchar(50) null,
	phone varchar(15) null,
	salary int default 0 null,
	constraint id
		unique (id)
);

alter table hillelTest.employees
	add primary key (id);



 */
@Entity
@Table(name = "Employees")
@Setter
@Getter
@Accessors(chain = true)
@ToString
public class Employees {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private long id;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;

    private String sex;

    private long age;

    private String email;

    private String phone;

    private long salary;
}
