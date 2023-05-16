package org.java8.programming;

import java.util.Arrays;
import java.util.List;

public class SumOfEven {
    public static void main(String[] args) {
        List<Integer> asList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14);
        int intSum = asList.stream().filter(x -> x % 2 == 0).mapToInt(Integer::intValue).sum();
        System.out.println(intSum);
    }
}
