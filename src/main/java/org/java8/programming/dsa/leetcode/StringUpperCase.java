package org.java8.programming.dsa.leetcode;

import java.util.Arrays;

public class StringUpperCase {
    public static void main(String[] args) {

        String[] asString = {"hello", "mr.", " prashanth"};
        Arrays.stream(asString).map(x-> x.toUpperCase()).forEach(System.out::println);
    }
}
