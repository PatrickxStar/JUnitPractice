package org.example;

public class NumberComparison {

    public String compareNumbers(int a, int b) {
        if (a > b) {
            return "The first number was larger than the second.";
        } else if (a < b) {
            return "The second number was larger than the first.";
        } else {
            return "Numbers are the same.";
        }
    }
}
