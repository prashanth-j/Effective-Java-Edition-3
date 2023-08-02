package org.java8.programming.math;

import java.util.*;


public class Factorial {
    static Map<Integer, Integer> memo = new HashMap<>();

    public static void main(String[] args) {
        int n = 5;
        int r = 3;

        int mul = findFactorial(r) * findFactorial(n - r);
        int factN = findFactorial(n);
        int comb = 0;
        if (mul != 0) {
            comb = factN / mul;
        }
        System.out.println(comb);
        int a[] = {1,2,3};

    }

    private static int findFactorial(int n) {
        List<Integer> list = new ArrayList<>();

        if (n < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers.");
        }

        if (n == 0 || n == 1) {
            return 1;
        }
        if (memo.containsKey(n)) {
            System.out.printf("grabbing memo[%d]\n", n);
            return memo.get(n);
        }

        int result = n * findFactorial(n - 1);
        memo.put(n, result);
        return result;
    }
}
