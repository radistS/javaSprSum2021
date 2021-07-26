package com.bank.echange.repository;


import com.bank.echange.entity.CurrencyEnum;
import com.bank.echange.entity.Rate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RateRepository extends JpaRepository<Rate, Long> {

    List<Rate> findAllByCurrency(CurrencyEnum currency);
}
