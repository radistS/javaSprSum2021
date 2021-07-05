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
public class Country {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "NAME")
    private String name;

    private String abr;

    @Transient
    private String currency;


    public Country(String name, String abr) {
        this.name = name;
        this.abr = abr;
    }

    public Country() {
    }
}
