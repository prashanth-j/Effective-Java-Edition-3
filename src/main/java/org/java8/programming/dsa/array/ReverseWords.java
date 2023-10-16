package org.java8.programming.dsa.array;

public class ReverseWords {

    public static void main(String[] args) {
        System.out.println(String.valueOf(reverseWords("hello prashanth 123")));
    }

    public static String reverseWords(String s) {
        char[] temp = s.toCharArray();

        String result = "";
        for (int i = 0; i < temp.length; i++) {
            if (i == temp.length - 1)
                result = temp[i] + result;
            else
                result = " " + temp[i] + result;
        }
        return result.toString();

    }
}
