package org.example;

public class SameOrNah {

    public String compareWords(String word1, String word2) {
        return word1.equalsIgnoreCase(word2) ? "The words are the same" : "The words are different";
    }
}
