package com.liqubase.data;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Setter
@Getter
@Entity
@AllArgsConstructor
@ToString
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

//    @OneToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "cityId")
//    private City city;
//
//    @OneToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "countryId")
//    private Country country;

    public Student() {
    }
}
