package org.example;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SimpleCollectionsAndErrorHandlingTest {

    SimpleCollectionsAndErrorHandling handler = new SimpleCollectionsAndErrorHandling();


    @Test
    void testCalculateAverage() {
        List<Integer> input = Arrays.asList(75, 50, 20, 20, 15, 30);
        assertEquals(35.0, handler.calculateAverage(input), 0.001);
    }

    @Test
    void testGetNumberByIndex() {
        List<Integer> input = Arrays.asList(75, 50, 20, 15, 30);
        assertEquals("Index out of bounds", handler.getNumberByIndex(input, 10));
    }
}
