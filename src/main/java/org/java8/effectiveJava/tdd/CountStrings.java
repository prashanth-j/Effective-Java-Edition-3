package org.java8.effectiveJava.tdd;

import java.util.HashMap;
import java.util.Map;

public class CountStrings {

    public Map<String, Integer> countString(String input) {
        String[] splitWords = input.split(" ");
        Map<String, Integer> addedWords = new HashMap<>();
        for (String word : splitWords) {
            if (addedWords.containsKey(word)) {
                addedWords.put(word, addedWords.getOrDefault(word, 0) + 1);
            } else {
                addedWords.put(word, 1);
            }
        }
        System.out.println(addedWords);
        return addedWords;
    }
}
