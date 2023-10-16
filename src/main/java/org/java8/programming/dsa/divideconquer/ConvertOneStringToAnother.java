package org.java8.programming.dsa.divideconquer;

public class ConvertOneStringToAnother {
    public static void main(String[] args) {
        System.out.println(findMinOperation("table", "tbres"));
    }

    private static int findMinOperation(String s1, String s2) {
        return findMinOperation(s1, s2, 0, 0);
    }

    private static int findMinOperation(String s1, String s2, int i, int i1) {
        if (i == s1.length()) {
            return s2.length() - i1;
        }
        if (i1 == s2.length()) {
            return s1.length() - i1;
        }
        if (s1.charAt(i) == s2.charAt(i1)) {
            return findMinOperation(s1, s2, i + 1, i1 + 1);
        }
        int deleteOp = 1 + findMinOperation(s1, s2, i1 + 1, i);
        int insertOp = 1 + findMinOperation(s1, s2, i, i1 + 1);
        int replaceOp = 1 + findMinOperation(s1, s2, i + 1, i1 + 1);
        return Math.min(deleteOp, Math.min(insertOp, replaceOp));
    }
}
