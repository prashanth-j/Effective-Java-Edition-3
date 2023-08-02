package org.java8.programming.dsa.leetcode;

import java.util.Arrays;

public class MergeTwoSortedArray {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 0, 0, 0};
        int[] b = {2, 5, 6};
        merge(a, a.length - b.length, b, b.length);
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        // for(int i=0;i<n;i++){
        //     nums1[i+m] = nums2[i];
        // }
        // Arrays.sort(nums1);

        int r1 = m - 1;
        int r2 = n - 1;
        long before = System.currentTimeMillis();
        for (int w = m + n - 1; w >= 0; w--) {
            if (r1 >= 0 && r2 >= 0) {
                nums1[w] = nums1[r1] > nums2[r2] ? nums1[r1--] : nums2[r2--];
            } else if (r1 >= 0) {
                nums1[w] = nums1[r1--];

            } else {
                nums1[w] = nums2[r2--];
            }

        }
        long after = System.currentTimeMillis();
        System.out.println("Time in ms--" + (after - before));
        Arrays.stream(nums1).forEach(System.out::println);
    }

}
