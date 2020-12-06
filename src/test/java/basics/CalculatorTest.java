package basics;

import FundamentalsTesting.Calculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    @Test
    public void testAdd() {
        // given
        Calculator calculator = new Calculator();

        // when
        int result = calculator.add(2, 4);

        // then
        assertEquals(6, result);
    }

    @Test
    public void testDivision() {
        // given
        Calculator calculator = new Calculator();

        // when
        int result = calculator.divide(15, 5);

        // then
        assertEquals(3, result);
    }

    @Test
    public void testSubstraction() {
        // given
        Calculator calculator = new Calculator();

        // when
        int result = calculator.substract(15, 5);

        // then
        assertEquals(10, result);
    }

    @Test
    public void testMultiplication() {
        // given
        Calculator calculator = new Calculator();

        // when
        int result = calculator.multiply(3, 5);

        // then
        assertEquals(15, result);
    }
}
