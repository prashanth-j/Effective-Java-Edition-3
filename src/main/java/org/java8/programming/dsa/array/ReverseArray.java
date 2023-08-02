package org.java8.programming.dsa.array;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5, 6, 7, 8};
        for (int i = 0; i < Math.floor(a.length / 2); i++) {
            int temp = a[i];
            a[i] = a[a.length - i - 1];
            a[a.length - i - 1] = temp;
        }
        Arrays.stream(a).forEach(System.out::print);
    }
}
