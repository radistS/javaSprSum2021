package excange;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;

import java.math.BigDecimal;

public class ExchangeService {
    private Ammount ammount;
    private Rate rate;

    public ExchangeService(Ammount ammount, Rate rate) {
        this.ammount = ammount;
        this.rate = rate;
    }

    public BigDecimal exchange(int accountNumber){

        BigDecimal ammount = this.ammount.getAmmount(111);

        BigDecimal currency  = rate.getRate("USD");

        return ammount.multiply(currency);
    }


}
