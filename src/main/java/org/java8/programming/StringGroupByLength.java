package org.java8.programming;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StringGroupByLength {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("apple", "banana", "pear", "kiwi", "orange");
        System.out.println(groupByLength(strings));
    }

    private static Map<Integer, List<String>> groupByLength(List<String> strings) {
        return strings.stream().collect(Collectors.groupingBy(String::length));
    }
}
