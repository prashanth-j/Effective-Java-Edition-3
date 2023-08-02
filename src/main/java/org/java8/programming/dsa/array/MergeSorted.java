package org.java8.programming.dsa.array;

import java.util.Arrays;

public class MergeSorted {

    public static void main(String[] args) {
        int nums1[] = new int[]{1, 2, 3, 0, 0, 0}, m = 3;
        int nums2[] = {2, 5, 6}, n = 3;
        merge(nums1, m, nums2, n);
        System.out.println(Arrays.toString(nums1));
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        // for(int i=0;i<n;i++){
        //     nums1[i+m] = nums2[i];
        // }
        // Arrays.sort(nums1);

        int r1 = m - 1;
        int r2 = n - 1;
        for (int w = m + n - 1; w >= 0; w--) {
            if (r1 >= 0 && r2 >= 0) {
                nums1[w] = nums1[r1] > nums2[r2] ? nums1[r1--] : nums2[r2--];
            } else if (r1 >= 0) {
                nums1[w] = nums1[r1--];

            } else {
                nums1[w] = nums2[r2--];
            }

        }


        return;
    }
}
