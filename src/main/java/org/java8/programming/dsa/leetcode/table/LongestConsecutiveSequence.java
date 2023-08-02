package org.java8.programming.dsa.leetcode.table;

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {
    public static void main(String[] args) {
        System.out.println(longestConsecutive(new int[]{100, 4, 200, 1, 3, 2}));
    }

    public static int longestConsecutive(int[] nums) {
        int max = 0;
        Set<Integer> set = new HashSet<>();
        for (int val : nums) set.add(val);

        for (int i : nums) {
            if (!set.contains(i - 1)) {
                int total = 0;
                while (set.remove(i++)) {
                    total++;
                }
                max = Math.max(max, total);
            }

        }
        return max;
    }
}
