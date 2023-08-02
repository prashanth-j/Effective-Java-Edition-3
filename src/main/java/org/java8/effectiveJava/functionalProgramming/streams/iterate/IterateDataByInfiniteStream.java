package org.java8.effectiveJava.functionalProgramming.streams.iterate;

import java.time.LocalDate;
import java.util.stream.Stream;

public class IterateDataByInfiniteStream {
    public static void main(String[] args) {
        // Geneate date for next 30 days
        /*
         * Stream Iterate method accepts 2 parameter
         * First parameter is seed, which is the initial value.
         * Second parameter is Unary Operator, basically lambda expression defines the days
         * */
        Stream.iterate(LocalDate.now(), d -> d.plusDays(1)).limit(30).forEach(System.out::println);
        // Generate number AP upto 45
        /*
         * Iterate method here accepts 3 parameter, first is seed, second is Predicate and 3 paramater is Unary operator
         * */
        Stream.iterate(0, d -> d < 50, d -> d + 5).forEach(System.out::println);
    }
}
