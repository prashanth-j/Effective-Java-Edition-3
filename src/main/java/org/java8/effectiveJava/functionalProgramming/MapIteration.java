package org.java8.effectiveJava.functionalProgramming;

import java.util.*;

public class MapIteration {
    public static void main(String[] args) {
        String Votes[] = {"john", "johnny", "jackie", "johnny", "john",
                " jackie", "jamie", "jamie", "john", "johnny", "jamie",
                "johnny", "john" };
        winner(Votes, Votes.length);
    }

    public static void winner(String arr[], int n) {
        // add your code
        Map<String, Integer> candidateVotes = new HashMap<>();
        for (String vote : arr) {
            if (candidateVotes.containsKey(vote)) {
                candidateVotes.put(vote, candidateVotes.get(vote) + 1);
            } else {
                candidateVotes.put(vote, 1);
            }
        }

        SortedSet<Map.Entry<String, Integer>> sortedSet = new TreeSet<>(
                Comparator.comparing(Map.Entry::getKey)
        );
        sortedSet.addAll(candidateVotes.entrySet());

        /*for (Map.Entry<String, Integer> entry : sortedSet) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }*/
        System.out.println(sortedSet.stream().max(Map.Entry.comparingByValue()).get().getKey());
        String []result = {String.valueOf(sortedSet.stream().max(Map.Entry.comparingByValue()).get())};
    }
}

