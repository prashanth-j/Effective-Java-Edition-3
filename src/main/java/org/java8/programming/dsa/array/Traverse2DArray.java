package org.java8.programming.dsa.array;

public class Traverse2DArray {

    public static void main(String[] args) {

        int n = 3;
        int m = 3;
        int[][] arr
                = {{3, 2, 7}, {2, 6, 8}, {5, 1, 9}};

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.println(arr[i][j] + " ");
            }
        }
    }
}
