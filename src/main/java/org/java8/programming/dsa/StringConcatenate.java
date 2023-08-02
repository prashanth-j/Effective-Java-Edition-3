package org.java8.programming.dsa;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringConcatenate {

    public static void main(String[] args) {
        List<String> strings = Arrays.asList("Hello ", "World ", "Java ", "8");

        String concatenatedString = strings.stream()
                .collect(Collectors.joining());

        System.out.println("Concatenated string: " + concatenatedString);
    }
}
