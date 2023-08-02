package org.java8.programming.dsa.leetcode;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MaxNumber {
    public static void main(String[] args) {
        List<Integer> asList = Arrays.asList(10, 20, 30, 40, 50, 10, 20);
        Optional<Integer> max = asList.stream().max(Integer::compare);
        if(max.isPresent()) System.out.println(max.get());
        else System.out.println("no number");
    }
}
