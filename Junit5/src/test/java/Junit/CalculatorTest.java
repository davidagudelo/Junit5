package Junit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private Calculator calculator;
    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @Test
    void add() {
        int result = calculator.add(1,2);
        assertEquals(3,result);
    }

    @Test
    void subtrac() {
        int result = calculator.subtrac(4,2);
        assertEquals(2,result);
    }

    @Test
    void divide() {
        int result = calculator.divide(4,2);
        assertEquals(2,result);
    }

    @Test
    void divideByCero() {
        assertThrows(ArithmeticException.class, () ->calculator.divideByZero(4,0),
                "No se puede dividir por cero");

    }
}