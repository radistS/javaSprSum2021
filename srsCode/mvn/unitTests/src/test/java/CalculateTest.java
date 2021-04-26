import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.stream.Stream;

public class CalculateTest {

    @BeforeAll
    public static void beforeClass() {
        System.out.println("before class");
    }

    @BeforeEach
    public void before() {
        System.out.println("-- before");
    }

    @Test
    public void sum() {
        System.out.println("---- test sum : pos");
        Assertions.assertEquals(4, Calculate.sum(2, 2));
    }

    @Test
    public void sumNeg() {
        System.out.println("---- test sum : neg");
        Assertions.assertNotEquals(4, Calculate.sum(2, 3));
    }

    @Test
    public void mult() {
        System.out.println("---- test mult");
        Assertions.assertEquals(4, Calculate.mult(2, 2));
    }

    @Test
    public void sub() {
        System.out.println("---- test sub");
        Assertions.assertEquals(0, Calculate.sub(2, 2));
    }

    @Test
    public void div() {
        System.out.println("---- test div");
        Assertions.assertEquals(1, Calculate.div(2, 2));
    }

    @Test
    public void divZeroByAny() {
        System.out.println("---- test div");
        Assertions.assertEquals(0, Calculate.div(0, 2));
    }

    @Disabled
    @Test
    public void divZero(){
        Assertions.assertThrows(ArithmeticException.class, () -> Calculate.div(2, 0));
    }

    @RepeatedTest(10)
    public void timeoutTest() {
        System.out.println("test repeat");
    }

    @Disabled
    @ParameterizedTest
    @ValueSource(ints = {1, 2, 3, 4, 5})
    void paramTestSub(int arg) {
        assertTrue(Calculate.sub(10 ,arg) > 0);
    }

    private void assertTrue(boolean b) {
    }

//    static Stream<Arguments> arguments = Stream.of(
//            Arguments.of(null, true), // null strings should be considered blank
//            Arguments.of("", true),
//            Arguments.of("  ", true),
//            Arguments.of("not blank", false)
//    );
//
//    @ParameterizedTest
//    @VariableSource("arguments")
//    void paramTestSub1(int arg) {
//        assertTrue(Calculate.sub(10 ,arg) > 0);
//    }
    @AfterEach
    public void after() {
        System.out.println("-- after");
    }

    @AfterAll
    public static void afterClass() {
        System.out.println("after class");
    }

}
