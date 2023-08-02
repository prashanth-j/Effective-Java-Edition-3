package org.java8.programming.dsa;

public class MajorityElement {
    public static void main(String[] args) {

        int a[] = {3, 1, 3, 3, 2, 1, 4, 5, 1, 1, 6, 1};
        int majorityElement = majorityElement(a, a.length);
        System.out.println(majorityElement);
    }

    static int majorityElement(int a[], int size) {
        // your code here
        int majorityElement = 0;
        int count = 0;

        for (int num : a) {
            if (count == 0) {
                majorityElement = num;
                count = 1;
            } else if (majorityElement == num) {
                count++;
            } else {
                count--;
            }
        }

        return majorityElement;
    }
}
