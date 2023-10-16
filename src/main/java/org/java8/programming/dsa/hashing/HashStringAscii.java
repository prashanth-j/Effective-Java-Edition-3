package org.java8.programming.dsa.hashing;

import java.util.Arrays;

public class HashStringAscii {


    public static void main(String[] args) {
        String[] array = new String[25];
        String[] words = {"API", "APIS"};
        for (String word : words) {
            int cellIndex = hashCodeString(word, array.length - 1);
            array[cellIndex] = word;
        }

        System.out.println(Arrays.toString(array));
    }

    public static int hashCodeString(String word, int cellNumber) {
        int total = 0;
        for (int i = 0; i < word.length(); i++) {
            total += word.charAt(i);
        }
        System.out.println(total);
        return total % cellNumber;
    }


}
