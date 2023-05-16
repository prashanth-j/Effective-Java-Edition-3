package org.java8.programming;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortNumber {
    public static void main(String[] args) {
        List<Integer> asList = Arrays.asList(10, 20, 30, 40, 50, 10, 20);
        sortAsc(asList);
        sortDesc(asList);
    }

    public static void sortAsc(List<Integer> asList) {
        List ascList = asList.stream().sorted().collect(Collectors.toList());
        System.out.println(ascList);
    }

    public static void sortDesc(List<Integer> asList) {
        List ascList = asList.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(ascList);
    }
}
