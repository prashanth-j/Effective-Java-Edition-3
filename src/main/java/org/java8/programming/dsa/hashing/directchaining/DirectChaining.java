package org.java8.programming.dsa.hashing.directchaining;

import java.util.LinkedList;

public class DirectChaining {
    LinkedList<String>[] hashTable;

    public DirectChaining(int chainSize) {
        this.hashTable = new LinkedList[chainSize];
    }

    public static int hashCodeString(String word, int cellNumber) {
        int total, i;
        for (total = 0, i = 0; i < word.length(); i++) {
            total += word.charAt(i);
        }
        System.out.println(total);
        return total % cellNumber;
    }

    public void insertHashTable(String word) {
        int hashCode = hashCodeString(word, hashTable.length);
        if (hashTable[hashCode] == null) {
            hashTable[hashCode] = new LinkedList<>();
            hashTable[hashCode].add(word);
        } else {
            hashTable[hashCode].add(word);
        }
    }

    public void displayHashTable() {
        if (hashTable == null) {
            System.out.println("Hash Table does not exists");
        } else {
            for (int i = 0; i < hashTable.length; i++) {
                System.out.println(i + "" + hashTable[i]);
            }
        }
    }
}
