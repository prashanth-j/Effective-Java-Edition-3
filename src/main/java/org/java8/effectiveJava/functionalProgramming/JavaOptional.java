package org.java8.effectiveJava.functionalProgramming;

import java.util.Optional;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JavaOptional {
    public static void main(String[] args) {
        System.out.println(firstMatch("stream").orElse("could not found match"));
        System.out.println(firstMatch("hello").orElse("could not found match"));
    }

    private static Optional firstMatch(String stream) {
        String s = "I am learning lambdas and stream";
        Matcher matcher = Pattern.compile(stream).matcher(s);
        return matcher.find() ? Optional.of(matcher.group()) : Optional.empty();
    }
}
