package excange;

import lombok.AllArgsConstructor;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Matchers.any;
import static org.mockito.Matchers.anyInt;
import static org.mockito.Matchers.anyString;
import static org.mockito.Matchers.matches;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


class ExchangeServiceTest {

    @Test
    void exchange() {

        Ammount ammount = mock(Ammount.class);
        when(ammount.getAmmount(anyInt())).thenReturn(BigDecimal.TEN);
        Rate rate = mock(Rate.class);
        when(rate.getRate(anyString())).thenReturn(BigDecimal.TEN);


        ExchangeService exchangeService = new ExchangeService(ammount, rate);

        System.out.println(exchangeService.exchange(11111));

    }
}