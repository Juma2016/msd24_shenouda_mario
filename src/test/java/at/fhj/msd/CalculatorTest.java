package at.fhj.msd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    private ICalculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new CalculatorImpl();
    }
    @Test
    @DisplayName("Testing add() with normal values")
    void testAddNormalValues() {
        double result = calculator.add(2, 3);
        assertEquals(5, result, "2 + 3 should equal 5");
    }

    @Test
    @DisplayName("Testing add() with zeros")
    void testAddWithZero() {
        double result = calculator.add(0, 0);
        assertEquals(0, result, "0 + 0 should equal 0");
    }

    @Test
    @DisplayName("Testing add() with negative values")
    void testAddWithNegative() {
        double result = calculator.add(-2, 3);
        assertEquals(1, result, "-2 + 3 should equal 1");
    }
    @Test
    @DisplayName("Testing minus() with normal values")
    void testMinusNormalValues() {
        double result = calculator.minus(5, 3);
        assertEquals(2, result, "5 - 3 should equal 2");
    }

    @Test
    @DisplayName("Testing minus() with zeros")
    void testMinusWithZero() {
        double result = calculator.minus(0, 0);
        assertEquals(0, result, "0 - 0 should equal 0");
    }

    @Test
    @DisplayName("Testing minus() with negative values")
    void testMinusWithNegative() {
        double result = calculator.minus(2, -3);
        assertEquals(5, result, "2 - (-3) should equal 5");
    }
    @Test
    @DisplayName("Testing multiply() with normal values")
    void testMultiplyNormalValues() {
        double result = calculator.multiply(2, 3);
        assertEquals(6, result, "2 * 3 should equal 6");
    }

    @Test
    @DisplayName("Testing multiply() with zero")
    void testMultiplyWithZero() {
        double result = calculator.multiply(0, 4);
        assertEquals(0, result, "0 * 4 should equal 0");
    }

    @Test
    @DisplayName("Testing multiply() with negative values")
    void testMultiplyWithNegative() {
        double result = calculator.multiply(-2, 3);
        assertEquals(-6, result, "-2 * 3 should equal -6");
    }
    @Test
    @DisplayName("Testing divide() with normal values")
    void testDivideNormalValues() {
        double result = calculator.divide(10, 2);
        assertEquals(5, result, "10 / 2 should equal 5");
    }

    @Test
    @DisplayName("Testing divide() with negative values")
    void testDivideWithNegative() {
        double result = calculator.divide(-10, 2);
        assertEquals(-5, result, "-10 / 2 should equal -5");
    }

    @Test
    @DisplayName("Testing divide() with division by zero")
    void testDivideByZero() {
        assertThrows(ArithmeticException.class, () -> calculator.divide(10, 0),
                     "Division by zero should throw ArithmeticException");
    }
    @Test
    @DisplayName("Testing factorial() method with valid input")
    void testFactorial() {
    int result = calculator.factorial(5);
    assertEquals(120, result, "Factorial of 5 should be 120");
}

}
