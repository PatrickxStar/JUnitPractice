package org.example;

import java.util.*;

public class SimpleCollectionsAndErrorHandling {

    public List<Integer> removeDuplicates(List<Integer> numbers) {
        return new ArrayList<>(new HashSet<>(numbers));
    }

    public double calculateAverage(List<Integer> numbers) {
        int sum = numbers.stream().mapToInt(Integer::intValue).sum();
        return numbers.isEmpty() ? 0.0 : (double) sum / numbers.size();
    }

    public String getNumberByIndex(List<Integer> numbers, int index) {
        try {
            return String.valueOf(numbers.get(index));
        } catch (IndexOutOfBoundsException e) {
            return "Index out of bounds";
        }
    }
}
