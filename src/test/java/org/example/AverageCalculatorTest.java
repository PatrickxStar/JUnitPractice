package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AverageCalculatorTest {

    AverageCalculator calculator = new AverageCalculator();

    @Test
    void testCalculateAverage() {
        int[] numbers = {1, 2, 3, 4, 5};
        assertEquals(3.0, calculator.calculateAverage(numbers), 0.001);
    }

    @Test
    void testCalculateAverageWithExceptions_NullArray() {
        assertThrows(NullPointerException.class, () -> calculator.calculateAverageWithExceptions(null));
    }

    @Test
    void testCalculateAverageWithLogicError() {
        int[] numbers = {1, 2, 3, 4, 5};
        assertEquals(3.0, calculator.calculateAverageWithLogicError(numbers), 0.001);
    }
}
