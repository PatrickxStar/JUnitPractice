package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SameOrNahTest {

    SameOrNah comparer = new SameOrNah();

    @Test
    void testCompareWords_SameWords() {
        assertEquals("The words are the same", comparer.compareWords("Hello", "hello"));
    }

    @Test
    void testCompareWords_DifferentWords() {
        assertEquals("The words are different", comparer.compareWords("Hello", "World"));
    }
}
