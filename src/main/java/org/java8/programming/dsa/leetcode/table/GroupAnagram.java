package org.java8.programming.dsa.leetcode.table;

import java.util.*;

public class GroupAnagram {
    public static void main(String[] args) {
        String[] strs = new String[]{"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> lists = groupAnagrams(strs);
        System.out.println(lists);
    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> table = new HashMap<>();
        for (String str : strs
        ) {
            char[] word = str.toCharArray();
            Arrays.sort(word);
            String sorted = new String(word);
            table.putIfAbsent(sorted, new ArrayList<>());
            table.get(sorted).add(str);
        }
        return new ArrayList<>(table.values());
    }
}
