package org.java8.programming.dsa.hashing.openaddressing.linearprobing;

import java.util.ArrayList;

public class LinearProbing {
    String[] hashTable;
    int usedCellNumber;

    public LinearProbing(int size) {
        hashTable = new String[size];
        usedCellNumber = 0;
    }

    public static int hashCodeString(String word, int cellNumber) {
        int total = 0;
        for (int i = 0; i < word.length(); i++) {
            total += word.charAt(i);
        }
        System.out.println(total);
        return total % cellNumber;
    }

    public double getLoadFactor() {
        double loadFactor = usedCellNumber * 1.0 / hashTable.length;
        return loadFactor;
    }

    public void rehashKeys(String word) {
        usedCellNumber = 0;
        ArrayList<String> data = new ArrayList<>();
        for (String s : hashTable) {
            if (s != null) {
                data.add(s);
            }
            data.add(s);
            hashTable = new String[hashTable.length * 2];
            for (String s1 : data
            ) {
                // Insertion to hashTable
                insertInHashTable(s1);
            }
        }
    }

    public void insertInHashTable(String word) {
        if (getLoadFactor() >= 0.75) {
            rehashKeys(word);
        } else {
            int index = hashCodeString(word, hashTable.length);
            for (int i = index; i < hashTable.length; i++) {
                int newIndex = i %  hashTable.length;
                if (hashTable[newIndex] == null) {
                    hashTable[newIndex] = word;
                    System.out.println("The" + word + " succesfully inserted at location" + newIndex);
                    break;
                } else {
                    System.out.println(newIndex + " is alreay occupied");
                }
            }
        }
        usedCellNumber++;
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
