package org.java8.programming.dsa.String;

public class ReverseWords {
    public static void main(String[] args) {
        String res = reverseWords("  hello world  ");
        System.out.println(res);
    }

    public static String reverseWords(String s) {
        String[] words = s.split("");
        String result = "";
        for (int i = words.length - 1; i >= 0; i--) {
            result += words[i];
        }
        return result;
    }
}
