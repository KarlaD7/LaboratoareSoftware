/*package proiectaresoftware.advanced;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class DoubleCalculatorTest {

    @Test
    void addTest(){
        double d=0.1;
        assertTrue(d>0);
    }

    private DoubleCalculator calculator;
    private final double DELTA = 0.0001;

    @BeforeEach
    public void setUp() {
        calculator = new DoubleCalculator(0.0);
    }

    @Test
    public void testAddPositives() {
        // Arrange
        calculator.init();
        // Act
        calculator.add(10.5).add(5.2);
        // Assert
        Assertions.assertEquals(15.7, (double) calculator.result(), DELTA);
    }

    @Test
    public void testAddNegatives() {
        // Arrange
        calculator.init();
        // Act
        calculator.add(-10.5).add(-5.2);
        // Assert
        Assertions.assertEquals(-15.7, (double) calculator.result(), DELTA);
    }

    @Test
    public void testSubtractPositives() {
        // Arrange
        calculator.init();
        calculator.add(10.5); // Despărțit pe rând nou
        // Act
        calculator.subtract(5.2);
        // Assert
        Assertions.assertEquals(5.3, (double) calculator.result(), DELTA);
    }

    @Test
    public void testSubtractNegatives() {
        // Arrange
        calculator.init();
        calculator.add(-10.5); // Despărțit pe rând nou
        // Act
        calculator.subtract(-5.2);
        // Assert
        Assertions.assertEquals(-5.3, (double) calculator.result(), DELTA);
    }

    @Test
    public void testMultiplyPositives() {
        // Arrange
        calculator.init();
        calculator.add(10.0); // Despărțit pe rând nou
        // Act
        calculator.multiply(5.5);
        // Assert
        Assertions.assertEquals(55.0, (double) calculator.result(), DELTA);
    }

    @Test
    public void testMultiplyNegatives() {
        // Arrange
        calculator.init();
        calculator.add(-10.0);
        // Act
        calculator.multiply(-5.5);
        // Assert
        Assertions.assertEquals(55.0, (double) calculator.result(), DELTA);
    }

    @Test
    public void testDividePositives() {
        //arrange
        calculator.init();
        calculator.add(10.0);
        //act
        calculator.divide(2.0);
        //assert
        Assertions.assertEquals(5.0, (double) calculator.result(), DELTA);
    }

    @Test
    public void testDivideNegatives() {
        //arrange
        calculator.init();
        calculator.add(-10.0);
        //act
        calculator.divide(-2.0);
        //assert
        Assertions.assertEquals(5.0, (double) calculator.result(), DELTA);
    }

    @AfterEach
    public void tearDown() {
        if (calculator != null) {
            calculator.clear();
            calculator = null;
        }
    }
}*/