package org.java8.programming.dsa.array;

public class PrintSubsequence {
    public static void main(String[] args) {
        printSubsequence("abc", "");
    }

    private static void printSubsequence(String input, String res) {
        if (input.length() == 0) {
            System.out.println(res);
            return;
        }
        char split = input.charAt(0);
        String question = input.substring(1);
        printSubsequence(question, res + "");
        printSubsequence(question, res + split);
    }
}
