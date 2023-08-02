package org.java8.programming.dsa.stack;

import java.util.Stack;

public class ValidParenthesis {
    public static void main(String[] args) {
        System.out.println(isValid("(]"));
    }

    public static boolean isValid(String s) {
        Stack sk = new Stack();
        for(char c : s.toCharArray()){
            sk.push(c);
        }
        for(int i = s.length() -1 ;i>=0;i--){
            char val = (char) sk.pop();
            if(s.charAt(i) != val){
                return false;
            }
        }
        return true;
    }
}
