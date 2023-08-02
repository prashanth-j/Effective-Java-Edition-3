package org.java8.programming.dsa.array;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class CommonElements {
    public static void main(String[] args) {
        int[] a = {1, 3, 4, 6, 7, 9};
        int[] b = {1, 2, 4, 5, 9, 10};
        findCommonElements(a, b);
    }

    private static void findCommonElements(int[] a, int[] b) {
        int p1 = 0;
        int p2 = 0;
        List<Integer> result = new ArrayList<>();
        while (p1 < a.length && p2 < b.length) {
            if (a[p1] == b[p2]) {
                result.add(a[p1]);
                p1++;
                p2++;
            } else if (a[p1] > b[p2]) {
                p2++;
            } else {
                p1++;
            }
        }
        System.out.println(result);


    }
}
