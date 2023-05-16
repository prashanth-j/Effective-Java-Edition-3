package org.java8.programming;

public class CountWordsInString {
    public static void main(String[] args) {
        String sentence = "This is a sample sentence.";

        long wordCount = countWords(sentence);

        System.out.println("Number of words: " + wordCount);
    }

    private static long countWords(String sentence) {
        return sentence.isEmpty() ? 0 : sentence.split("\\s+").length;
    }
}
