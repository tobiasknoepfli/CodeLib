package test;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class Testing {

    private main.Testing mathUtils;

    @BeforeEach
    public void setUp() {
        mathUtils = new main.Testing();
    }

//    SIMPLE ASSERTION
    @org.junit.jupiter.api.Test
    public void testAddition() {
        int result = mathUtils.add(2, 3);
        assertEquals(5, result);
    }

    @org.junit.jupiter.api.Test
    public void testDivision() {
        double result = mathUtils.divide(10, 2);
        assertEquals(5, result);
    }

//    EXCEPTION TESTING
    @org.junit.jupiter.api.Test
    public void testDivisionByZero() {
        assertThrows(ArithmeticException.class, () -> mathUtils.divide(10, 0));
    }

//    PARAMETERIZED TESTING
    @ParameterizedTest
    @ValueSource(ints = {1, 2, 3, 4, 5})
    public void testIsEven(int number) {
        boolean isEven = mathUtils.isEven(number);
        assertEquals(number % 2 == 0, isEven);
    }

    @org.junit.jupiter.api.Test
    public void testMultipleOperations() {
        mathUtils.add(2, 3);
        mathUtils.subtract(10, 5);
        mathUtils.multiply(2, 4);
        double result = mathUtils.divide(10, 2);
        assertEquals(5, result);
    }
}
