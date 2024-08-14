package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberComparisonTest {

    NumberComparison comparison = new NumberComparison();

    @Test
    void testCompareNumbers_FirstLarger() {
        assertEquals("The first number was larger than the second.", comparison.compareNumbers(10, 5));
    }

    @Test
    void testCompareNumbers_SecondLarger() {
        assertEquals("The second number was larger than the first.", comparison.compareNumbers(5, 10));
    }

    @Test
    void testCompareNumbers_SameNumbers() {
        assertEquals("Numbers are the same.", comparison.compareNumbers(5, 5));
    }
}
