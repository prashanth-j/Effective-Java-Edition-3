package org.java8.programming.dsa.leetcode;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;

public class MergeIntervals {


    public static void main(String[] args) {
        int[][] twoDArray = {{4, 12}, {10, 15}, {5, 10}, {5, 11}, {1, 6}, {10, 20}};
        Arrays.sort(twoDArray, Comparator.comparingInt(a -> a[0]));
        LinkedList<int[]> merged = new LinkedList();
        for (int[] interval : twoDArray) {
            if (merged.isEmpty() || merged.getLast()[1] < interval[0]) {
                merged.add(interval);
            } else {
                merged.getLast()[1] = Math.max(merged.getLast()[1], interval[1]);
            }
        }
        for (int[] a : merged) {
            Arrays.stream(a).forEach(System.out::println);
        }
    }
}
