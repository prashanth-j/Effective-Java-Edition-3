package org.java8.programming.dsa.table;

import java.util.HashMap;
import java.util.Map;

public class WordPattern {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println(Math.abs(a-b));
        System.out.println(wordPattern("abba", "dog dog dog dog"));
    }

    public static boolean wordPattern(String pattern, String s) {
        String[] sdata = s.split(" ");
        if (pattern.length() != sdata.length) return false;
        Map<Character, String> charToWord = new HashMap<>();
        Map<String, Character> wordToChar = new HashMap<>();


        for (int i = 0; i < pattern.length(); i++) {
            char ch = pattern.charAt(i);
            String word = sdata[i];
            if (!charToWord.containsKey(ch) && !wordToChar.containsKey(word)) {
                charToWord.put(ch, word);
                wordToChar.put(word, ch);
            } else {
                if (charToWord.getOrDefault(ch, "").equals(word) &&
                        wordToChar.getOrDefault(word, '\0').equals(ch)) {
                    return false;
                }
            }

        }
        return true;
    }
}
