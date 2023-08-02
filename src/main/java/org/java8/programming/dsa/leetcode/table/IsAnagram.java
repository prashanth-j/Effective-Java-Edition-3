package org.java8.programming.dsa.leetcode.table;

import java.util.HashMap;
import java.util.Map;

public class IsAnagram {
    public static void main(String[] args) {
        System.out.println(isAnagram("anagram", "nagaram"));
    }

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        Map<Integer, Character> table = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            table.put(i, s.charAt(i));
        }
        for (int i = 0; i < s.length(); i++) {
            if (!table.containsValue(t.charAt(i))) return false;
        }
        return true;
    }
}
