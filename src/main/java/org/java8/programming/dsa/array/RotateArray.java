package org.java8.programming.dsa.array;

public class RotateArray {

    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5};
        int k = 3;
        int N = a.length;
        k = k % N;
        reverseArray(a, N - k, N - 1);
        reverseArray(a, 0, N - k - 1);
        reverseArray(a, 0, N - 1);
        System.out.println(a);
    }

    private static void reverseArray(int[] a, int l, int r) {
        while (l <= r) {
            int temp = a[l];
            a[l] = a[r];
            a[r] = temp;
            l++;
            r--;
        }
    }
}
