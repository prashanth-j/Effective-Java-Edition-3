package org.java8.programming.dsa.hashing.openaddressing.linearprobing;

public class TestLinearProbing {
    public static void main(String[] args) {
        LinearProbing linearProbing = new LinearProbing(6);
        linearProbing.insertInHashTable("The");
        linearProbing.insertInHashTable("Quick");
        linearProbing.insertInHashTable("Brown");
        linearProbing.insertInHashTable("Fox");
        linearProbing.insertInHashTable("Jump");
        linearProbing.displayHashTable();

    }
}
