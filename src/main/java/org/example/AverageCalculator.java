package org.example;

public class AverageCalculator {

    public double calculateAverage(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return (double) sum / numbers.length;
    }

    public double calculateAverageWithExceptions(int[] numbers) {
        if (numbers == null) {
            throw new NullPointerException("Array is null");
        }
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return (double) sum / numbers.length;
    }

    public double calculateAverageWithLogicError(int[] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) { // Fixed logic error
            sum += numbers[i];
        }
        return (double) sum / numbers.length;
    }
}
