package org.java8.effectiveJava.tdd;

public class FizzBuzz {


    /**
     * Multiple of 3 return Fizz
     * Multiple of 5 return Buzz
     */
    public String fizzBuzz(int input) {
        if (input % 5 == 0) return "Buzz";
        else if (input % 3 == 0 && input % 5 == 0) return "Fizz";
        return "";
    }
}
