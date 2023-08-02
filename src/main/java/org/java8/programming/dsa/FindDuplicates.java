package org.java8.programming.dsa;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDuplicates {
    public static void main(String[] args) {
        List<Integer> asList = Arrays.asList(10, 20, 30, 40, 50, 10, 20);
        Set<Integer> set = new HashSet<>();
        asList.stream().filter(x -> !set.add(x)).forEach(System.out::println);
    }
}
