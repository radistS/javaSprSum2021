package com.bank.echange.dto;

import com.bank.echange.entity.CurrencyEnum;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Setter
@Getter
@NoArgsConstructor
public class WalletDto {
    Long id;
    CurrencyEnum currency;
    BigDecimal ammount;
}
