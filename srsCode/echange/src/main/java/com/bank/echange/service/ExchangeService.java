package com.bank.echange.service;

import com.bank.echange.dto.WalletDto;
import com.bank.echange.dto.WalletUpdateDto;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ExchangeService {

    void getRates() throws JsonProcessingException;

    List<WalletDto> exchange(WalletUpdateDto upd);
}
