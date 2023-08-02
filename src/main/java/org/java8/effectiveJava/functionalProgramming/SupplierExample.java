package org.java8.effectiveJava.functionalProgramming;

import java.util.function.IntSupplier;
import java.util.function.Supplier;

public class SupplierExample {
    public static void main(String[] args) {
        int i = 0;
        long before = System.currentTimeMillis();
        while (i < 100) {
            Supplier<Integer> val = () -> 42;
            System.out.println(val.get());
            i++;
        }
        long after = System.currentTimeMillis();
        System.out.println("differ in time using supplier  " + (after - before));

        long before1 = System.currentTimeMillis();
        int j = 0;
        while (j < 10) {
            IntSupplier intSupplier = () -> 42;
            System.out.println(intSupplier.getAsInt());
            j++;
        }
        long after1 = System.currentTimeMillis();
        System.out.println("differ in time using intSupplier  " + (after1 - before1));
    }
}
