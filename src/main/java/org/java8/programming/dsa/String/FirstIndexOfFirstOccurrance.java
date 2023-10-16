package org.java8.programming.dsa.String;

public class FirstIndexOfFirstOccurrance {
    public static void main(String[] args) {
        System.out.println(strStr("sadbutsad","sad"));
    }

    public static int strStr(String haystack, String needle) {
        return haystack.indexOf(needle) >= 0 ?    haystack.indexOf(needle) : -1;
    }
}
