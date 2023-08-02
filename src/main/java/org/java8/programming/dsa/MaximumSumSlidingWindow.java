package org.java8.programming.dsa;

public class MaximumSumSlidingWindow {
    public static int maxSumSlidingWindow(int[] nums, int k) {
        int maxSum = 0;
        int currentSum = 0;

        // Calculate the sum of the first window
        for (int i = 0; i < k; i++) {
            currentSum += nums[i];
        }
        maxSum = currentSum;

        // Slide the window through the array
        for (int i = k; i < nums.length; i++) {
            currentSum += nums[i] - nums[i - k]; // Add the current element and remove the element outside the window

            if (currentSum > maxSum) {
                maxSum = currentSum; // Update the maximum sum
            }
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int[] nums = {2, 5, 1, 8, 2, 9, 1};
        int k = 3;
        int maxSum = maxSumSlidingWindow(nums, k);
        System.out.println("Maximum sum of subarray of size " + k + ": " + maxSum);
    }
}

