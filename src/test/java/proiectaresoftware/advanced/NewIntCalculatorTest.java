package proiectaresoftware.advanced;

import org.junit.jupiter.api.*;
import proiectaresoftware.lab6.NewIntCalculator;

public class NewIntCalculatorTest {

    private NewIntCalculator calculator;

    @BeforeEach
    public void setUp() {
        calculator = new NewIntCalculator();
        calculator.init();
    }

    @Test
    public void testAddPositive() {
        calculator.add(10);
        calculator.add(5);
        Assertions.assertEquals(15, calculator.result());
    }

    @Test
    public void testAddNegatives() {
        calculator.add(-7);
        calculator.add(-3);
        Assertions.assertEquals(-10, calculator.result());
    }

    @Test
    public void testSubtractPositives() {
        calculator.add(20);
        calculator.subtract(8);
        Assertions.assertEquals(12, calculator.result());
    }

    @Test
    public void testSubtractNegatives() {
        calculator.add(-5);
        calculator.subtract(-3);
        Assertions.assertEquals(-2, calculator.result());
    }

    @Test
    public void testMultiplyPositives() {
        calculator.add(6);
        calculator.multiply(7);
        Assertions.assertEquals(42, calculator.result());
    }

    @Test
    public void testMultiplyNegatives() {
        calculator.add(-4);
        calculator.multiply(-3);
        Assertions.assertEquals(12, calculator.result());
    }

    @Test
    public void testMultiplyBy0() {
        calculator.add(99);
        calculator.multiply(0);
        Assertions.assertEquals(0, calculator.result());
    }

    @Test
    public void testDividePositives() {
        calculator.add(20);
        calculator.divide(4);
        Assertions.assertEquals(5, calculator.result());
    }

    @Test
    public void testDivideNegatives() {
        calculator.add(-12);
        calculator.divide(-3);
        Assertions.assertEquals(4, calculator.result());
    }

    @Test
    public void testDivideBy0() {
        calculator.add(10);
        Assertions.assertThrows(ArithmeticException.class, () -> {
            calculator.divide(0);
        });
    }

    @AfterEach
    public void tearDown() {
        calculator = null;
    }
}