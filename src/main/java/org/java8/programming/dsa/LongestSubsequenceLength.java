package org.java8.programming.dsa;

import java.util.Arrays;

public class LongestSubsequenceLength {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 5, 6, 7};
        int length = longestSubsequenceLength(arr);
        System.out.println(length);  // Output: 4
    }

    public static int longestSubsequenceLength(int[] arr) {
        Arrays.sort(arr);
        int currentLength = 1;
        int maxLength = 1;

        for (int i = 1; i < arr.length; i++) {
            int diff = Math.abs(arr[i] - arr[i - 1]);

            if (diff <= 1) {
                currentLength++;
            } else {
                maxLength = Math.max(currentLength, maxLength);
                currentLength = 1;
            }
        }

        maxLength = Math.max(currentLength, maxLength);
        return maxLength;
    }
}
