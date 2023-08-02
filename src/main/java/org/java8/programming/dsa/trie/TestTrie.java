package org.java8.programming.dsa.trie;

public class TestTrie {
    public static void main(String[] args) {
        Trie trie = new Trie();
        trie.insert("API");
        trie.insert("APIS");
        trie.search("AP");
    }
}
