package org.java8.programming.dsa.greedy.fractionaknapsack;

import java.util.Arrays;
import java.util.Comparator;

public class FractionalKnapSack {

    public static void main(String[] args) {
        Item[] items = {
                new Item(10, 60),
                new Item(20, 100),
                new Item(30, 120)
        };

        int capacity = 50;

        double maxValue = fractionalKnapSack(capacity, items);
        System.out.println(maxValue);
    }

    private static double fractionalKnapSack(int capacity, Item[] items) {

        Arrays.sort(items, Comparator.comparingDouble(item -> item.getValue() / item.getWeight()));
        int currentWeight = 0;
        double totalValue = 0d;
        for (Item item : items) {
            if (currentWeight + item.getWeight() <= capacity) {
                currentWeight += item.getWeight();
                totalValue += item.getValue();
            } else {
                int remainingCapacity = capacity - currentWeight;
                double fraction = remainingCapacity / item.getWeight();
                totalValue += fraction * item.getValue();
                break;
            }
        }
        return totalValue;
    }
}
