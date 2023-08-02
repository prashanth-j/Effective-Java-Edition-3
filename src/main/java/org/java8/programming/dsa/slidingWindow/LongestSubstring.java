package org.java8.programming.dsa.slidingWindow;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstring {
    public static void main(String[] args) {
        String s = "pwwkew";
        System.out.println(lengthOfLongestSubstring(s));

    }

    public static int lengthOfLongestSubstring(String s) {
        int start = 0;
        int end = 0;
        int n = s.length();
        int maxLength = 0;
        Set<Character> uniqueChars = new HashSet<>();
        while (end < n) {
            if (!uniqueChars.contains(s.charAt(end))) {
                uniqueChars.add(s.charAt(end));
                int currLength = end - start + 1;
                maxLength = Math.max(maxLength, currLength);
                end++;
            } else {
                uniqueChars.remove(s.charAt(start));
                start++;
            }
        }
        return maxLength;
    }
}
