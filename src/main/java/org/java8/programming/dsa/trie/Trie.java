package org.java8.programming.dsa.trie;

import java.util.HashMap;
import java.util.Map;

public class Trie {

    private TrieNode root;

    public Trie() {
        root = new TrieNode();
        System.out.println("Trie has been created");
    }

    public void insert(String word) {
        TrieNode currentNode = root;
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            TrieNode node = currentNode.getChildren().get(ch);
            if (node == null) {
                node = new TrieNode();
                Map<Character, TrieNode> child = new HashMap<>();
                child.put(ch, node);
                currentNode.setChildren(child);
            }
            currentNode = node;
        }
        currentNode.setEndOfString(true);
        System.out.println("Successfully inserted " + word);

    }

    public boolean search(String word) {
        TrieNode currentNode = root;
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            TrieNode trieNode = currentNode.getChildren().get(ch);
            if (trieNode == null) {
                System.out.println("Search string " + word + " does not exits");
                return false;
            }
            currentNode = trieNode;
        }
        if (currentNode.isEndOfString()) {
            System.out.println("word " + word + " exists in Trie");
            return true;
        } else {
            System.out.println("word: " + word + " does not exits");
        }
        return currentNode.isEndOfString();
    }
}
