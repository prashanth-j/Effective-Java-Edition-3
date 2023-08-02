package org.java8.programming.dsa.String;

public class IsVowel {

    public static void main(String[] args) {
        String VOWELS = "aeiouAEIOU";
        String name = "umbrella";
        System.out.println(name.toUpperCase());
        System.out.println(name);
        checkIfItHasVowel(name, VOWELS);
        int a = 0;
        int y = --a;
        System.out.println("a  " + a);
        System.out.println("y  " + y);
    }

    private static void checkIfItHasVowel(String name, String VOWELS) {
        int counter = 0;
        for (int i = 0; i < name.length(); i++) {
            if (VOWELS.indexOf(name.charAt(i)) != -1) {
                System.out.println(name.charAt(i));
                counter++;
            }
        }
        System.out.println(counter);
    }
}
