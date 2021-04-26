import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class CalculateUnitTest {

    private static Calculate calculate;

    @BeforeAll
    public static void beforeClass() {
        calculate  = new Calculate();
    }

    @Test
    void sum() {
        Assertions.assertEquals(4, Calculate.sum(2, 2));
    }

    @Test
    void mult() {
        Assertions.assertEquals(4, Calculate.mult(2, 2));
    }

    @Test
    void sub() {
        Assertions.assertEquals(0, Calculate.sub(2, 2));
    }@Test

    void subDivZero() {
        Assertions.assertThrows(ArithmeticException.class, () -> Calculate.div(2, 0));
    }


    @RepeatedTest(100)
    void div() {
        Assertions.assertEquals(1, Calculate.div(2, 2));
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 2, 3, 4, 5})
    void paramTestSub(int arg) {
        assertTrue(Calculate.sub(10, arg) > 0);
    }
}