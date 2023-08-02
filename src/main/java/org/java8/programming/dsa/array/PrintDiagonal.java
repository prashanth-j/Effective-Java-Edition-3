package org.java8.programming.dsa.array;

public class PrintDiagonal {
    public static void main(String[] args) {
        int n = 4;
        int a[][] = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 }
        };

        printPrincipalDiagonal(a, n);
        System.out.println("//s");
        printSecondaryDiagonal(a, n);
    }

    private static void printSecondaryDiagonal(int[][] a, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(i == j){
                    System.out.print(a[i][j]);
                }
            }
        }
    }

    private static void printPrincipalDiagonal(int[][] a, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if((i+j) == (n-1)){
                    System.out.print(a[i][j]);
                }
            }
        }
    }
}
