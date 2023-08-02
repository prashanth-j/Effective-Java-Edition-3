package org.java8.effectiveJava.functionalProgramming.streams.sec11;

import java.util.concurrent.atomic.AtomicLong;
import java.util.stream.LongStream;

public class AddTwoNumbers {
    public static void main(String[] args) {
        System.out.println("Sequential sum is : " + addNumberSequentially());
        System.out.println("Sequential sum is : " + streamAtomicLongSum());
        System.out.println("Sequential sum is : " + streamReduceSum());
    }

    private static long addNumberSequentially() {
        long result = 0L;
        for (long i = 1; i < 100_000_000; i++) {
            result += i;
        }
        return result;
    }

    private static AtomicLong streamAtomicLongSum() {
        AtomicLong sum = new AtomicLong(0L);
        LongStream.rangeClosed(1, 100_000_000).parallel().forEach(value -> sum.addAndGet(value));
        return sum;
    }

    private static long streamReduceSum() {
        return LongStream.rangeClosed(1, 100_000_000).parallel().reduce(0, Long::sum);
    }
}
