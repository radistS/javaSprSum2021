package com.bank.echange.controller;

import com.bank.echange.dto.WalletDto;
import com.bank.echange.dto.WalletUpdateDto;
import com.bank.echange.entity.CurrencyEnum;
import com.bank.echange.entity.Rate;
import com.bank.echange.repository.RateRepository;
import com.bank.echange.service.ExchangeService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @version 0.0.1
 */
@RestController
@RequestMapping("/api/v1/exchange")
@RequiredArgsConstructor
@Slf4j
public class ExchangeController {

    private final ExchangeService exchangeService;
    private final RateRepository rateRepository;

    @PostMapping
    public List<WalletDto> exchange(@RequestBody WalletUpdateDto wallet)  {
        return exchangeService.exchange(wallet);
    }

    @GetMapping("/rate/{curr}")
    public List<Rate> getRates(@PathVariable CurrencyEnum curr){
        return rateRepository.findAllByCurrency(curr);
    }
}
