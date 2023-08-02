package org.java8.programming.dsa.leetcode;

public class BinarySearchTree {
    public static void main(String[] args) {
        int a[] = {10, 20, 30, 40, 50, 60, 70, 80};
        System.out.println(findElement(a, 20));
    }

    public static boolean findElement(int a[], int target) {
        int i = 0, j = a.length - 1;

        while (i <= j) {
            int mid = j - (i + j) / 2;
            if (a[mid] == target) {
                return true;
            }
            if (a[mid] > target) {
                i = mid + 1;
            } else {
                j = mid - 1;
            }
        }
        return false;
    }
}
