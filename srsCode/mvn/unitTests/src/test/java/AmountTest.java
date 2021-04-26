import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class
AmountTest {

    @Test
    public void positive() {
        Assertions.assertTrue(Execute.checkAmount(100));
    }

    @Test
    public void zero() {
        Assertions.assertFalse(Execute.checkAmount(0));
    }

    @Test()
    public void negative() {
        Assertions.assertThrows(NotEnoughMoneyException.class, () -> Execute.checkAmount(-100));
    }


}
