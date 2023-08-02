package org.java8.programming.dsa;

public class StringPalindrome {
    public static void main(String[] args) {

        String s = "A man, a plan, a canal: Panama";
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetterOrDigit(s.charAt(i))) {
                stringBuilder.append(s.toLowerCase().charAt(i));
            }
        }
        String reverse = stringBuilder.reverse().toString();
        System.out.println(reverse);
        System.out.println(stringBuilder.equals(reverse));

    }

    public boolean isPalindrome(String s) {
        StringBuilder builder = new StringBuilder();

        for (char ch : s.toCharArray()) {
            if (Character.isLetterOrDigit(ch)) {
                builder.append(Character.toLowerCase(ch));
            }
        }

        String filteredString = builder.toString();
        String reversedString = builder.reverse().toString();

        return filteredString.equals(reversedString);
    }

    /**
     * An alternate solution using Java 8 Streams
     */
    public boolean isPalindromeUsingStreams(String s) {
        StringBuilder builder = new StringBuilder();

        s.chars()
                .filter(c -> Character.isLetterOrDigit(c))
                .mapToObj(c -> Character.toLowerCase((char) c))
                .forEach(builder::append);

        return builder.toString().equals(builder.reverse().toString());
    }
}
