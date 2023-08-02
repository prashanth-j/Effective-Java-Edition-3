package org.java8.effectiveJava.functionalProgramming.streams.iterate;

import java.util.Random;
import java.util.UUID;
import java.util.stream.Stream;

public class GenarateDataByInfiniteStream {
    public static void main(String[] args) {
        /*
         * Geneate method accepts supplier(without input paramter) but generates the data
         * */
        Stream.generate(() -> new Random().nextInt(10)).limit(10).forEach(System.out::println);
        System.out.println("-------UUID Number-----------");
        Stream.generate(() -> UUID.randomUUID()).limit(10).forEach(System.out::println);
    }
}
