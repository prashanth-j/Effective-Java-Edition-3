package org.java8.programming.dsa.hashing.directchaining;

public class DirectChainingTest {
    public static void main(String[] args) {
        DirectChaining directChaining = new DirectChaining(5);
        directChaining.insertHashTable("The");
        directChaining.insertHashTable("Quick");
        directChaining.insertHashTable("Brown");
        directChaining.insertHashTable("Fox");
        directChaining.insertHashTable("Jump");
        directChaining.displayHashTable();

    }
}
