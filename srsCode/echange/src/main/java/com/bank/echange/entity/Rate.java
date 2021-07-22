package com.bank.echange.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.sql.Timestamp;

@Setter
@Getter
@NoArgsConstructor
@Entity
@Table(name = "rate")
@Accessors(chain = true)
public class Rate {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    CurrencyEnum currency;
    BigDecimal sale;
    BigDecimal buy;
    Timestamp receive;
}
