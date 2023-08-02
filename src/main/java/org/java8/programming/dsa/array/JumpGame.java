package org.java8.programming.dsa.array;

import java.util.Arrays;

public class JumpGame {

    public static int minJumps(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;

        for (int i = 0; i < n; i++) {
            int maxJump = nums[i];
            for (int j = 1; j <= maxJump && i + j < n; j++) {
                dp[i + j] = Math.min(dp[i + j], dp[i] + 1);
            }
        }

        return dp[n - 1];
    }

    public static void main(String[] args) {
        int[] nums1 = {2, 3, 1, 1, 4};
        System.out.println(minJumps(nums1)); // Output: 2

        int[] nums2 = {2, 3, 0, 1, 4};
        System.out.println(minJumps(nums2)); // Output: 2
    }
}
