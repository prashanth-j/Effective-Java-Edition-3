package org.java8.programming.dsa.dynamicprogramming;

import java.util.Arrays;

public class ClimbStairs {
    public static void main(String[] args) {
        System.out.println(climbStairs(3));
    }

    public static int climbStairs(int n) {

        int[] dp = new int[n + 1];
        Arrays.fill(dp,-1);
        return climbStairsUtil(n, dp);

    }

    public static int climbStairsUtil(int n, int dp[]) {
        if (n <= 1)
            return dp[n] = 1;

        if (dp[n] != -1) {
            return dp[n];
        }
        dp[n] = climbStairsUtil(n - 1, dp) + climbStairsUtil(n - 2, dp);
        return dp[n];


    }
}
