package org.java8.programming.dsa.slidingWindow;

import java.util.ArrayList;
import java.util.List;

public class MinimumSizeSubArray {


    public static void main(String[] args) {
        System.out.println(minSubArrayLen(7, new int[]{2, 3, 1, 2, 4, 3}));
    }

    public static int minSubArrayLen(int target, int[] nums) {
        int minLen = Integer.MAX_VALUE;
        int start = 0;
        int end = 0;
        List<Integer> list = new ArrayList<>();
        while (end < nums.length) {
            list.add(nums[start]);
            int currSum = nums[start] + nums[end];
            if (currSum >= target) {
                list.add(nums[start]);
                list.add(nums[end]);
                int currLen = list.size();
                minLen = Math.min(minLen, currLen);
                end++;
                start++;
            } else {
                list.add(nums[start]);
                list.add(nums[end]);
                start++;
            }
        }

        return minLen;
    }
}
