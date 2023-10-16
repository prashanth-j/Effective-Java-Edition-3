package org.java8.programming.math;

public class PlusOne {

    public static void main(String[] args) {
        System.out.println(plusOne(new int[]{9}));
    }

    public static int[] plusOne(int[] digits) {
        int n = digits.length;

        // Traverse the digits array from right to left
        for (int i = n - 1; i >= 0; i--) {
            // Increment the current digit
            digits[i]++;

            // If the current digit becomes 10, carry over to the next digit
            if (digits[i] == 10) {
                digits[i] = 0;
            } else {
                // No need to carry over anymore, exit the loop
                return digits;
            }
        }

        // If we reach here, it means all digits were 9, so we need to add a new leading digit (1)
        int[] result = new int[n + 1];
        result[0] = 1;

        return result;
    }
}
