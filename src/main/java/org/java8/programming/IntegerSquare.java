package org.java8.programming;

import java.util.Arrays;
import java.util.List;

public class IntegerSquare {
    public static void main(String[] args) {
        List<Integer> asList = Arrays.asList(10, 20, 30, 40, 50, 10, 20);
        asList.stream().map(x -> x * x).forEach(System.out::println);
    }
}
