package proiectaresoftware.advanced;

import org.junit.jupiter.api.*;
import proiectaresoftware.lab6.DoubleCalculator;

public class DoubleCalculatorTest {

    private DoubleCalculator calculator;

    private static final double DELTA = 1e-9;
    @BeforeEach
    public void setUp() {
        calculator = new DoubleCalculator();
        calculator.init();
    }

    @Test
    public void testAddPositive() {
        calculator.add(3.5);
        calculator.add(1.5);
        Assertions.assertEquals(5.0, calculator.result(), DELTA);
    }

    @Test
    public void testAddNegatives() {
        calculator.add(-2.5);
        calculator.add(-1.5);
        Assertions.assertEquals(-4.0, calculator.result(), DELTA);
    }

    @Test
    public void testAddZero() {
        calculator.add(7.77);
        calculator.add(0.0);
        Assertions.assertEquals(7.77, calculator.result(), DELTA);
    }

    @Test
    public void testSubtractPositives() {
        calculator.add(10.0);
        calculator.subtract(4.5);
        Assertions.assertEquals(5.5, calculator.result(), DELTA);
    }

    @Test
    public void testSubtractNegatives() {
        calculator.add(-3.0);
        calculator.subtract(-1.5);
        Assertions.assertEquals(-1.5, calculator.result(), DELTA);
    }

    @Test
    public void testSubtractResultNegative() {
        calculator.add(2.0);
        calculator.subtract(5.0);
        Assertions.assertEquals(-3.0, calculator.result(), DELTA);
    }

    @Test
    public void testMultiplyPositives() {
        calculator.add(2.5);
        calculator.multiply(4.0);
        Assertions.assertEquals(10.0, calculator.result(), DELTA);
    }

    @Test
    public void testMultiplyNegatives() {
        calculator.add(-3.0);
        calculator.multiply(-2.0);
        Assertions.assertEquals(6.0, calculator.result(), DELTA);
    }

    @Test
    public void testMultiplyBy0() {
        calculator.add(123.45);
        calculator.multiply(0.0);
        Assertions.assertEquals(0.0, calculator.result(), DELTA);
    }

    @Test
    public void testDividePositives() {
        calculator.add(9.0);
        calculator.divide(4.0);
        Assertions.assertEquals(2.25, calculator.result(), DELTA);
    }

    @Test
    public void testDivideNegatives() {
        calculator.add(-8.0);
        calculator.divide(-2.0);
        Assertions.assertEquals(4.0, calculator.result(), DELTA);
    }

    @Test
    public void testDivideBy0ReturnsInfinity() {
        calculator.add(5.0);
        calculator.divide(0.0);
        Assertions.assertTrue(Double.isInfinite(calculator.result()),
                "Impartirea unui double la 0.0 ar trebui sa returneze Infinity");
    }

    @Test
    public void testDivideNegativeBy0ReturnsNegativeInfinity() {
        calculator.add(-5.0);
        calculator.divide(0.0);
        Assertions.assertTrue(Double.isInfinite(calculator.result()));
        Assertions.assertTrue(calculator.result() < 0);
    }

    @Test
    public void testChainingOperations() {
        calculator.add(10.0).divide(4.0).multiply(2.0).subtract(1.0);
        Assertions.assertEquals(4.0, calculator.result(), DELTA);
    }

    @Test
    public void testClearResetsState() {
        calculator.add(99.9);
        calculator.clear();
        Assertions.assertNull(calculator.result());
    }

    @AfterEach
    public void tearDown() {
        calculator = null;
    }
}