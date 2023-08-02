package org.java8.programming.dsa.stack;

public class StringRotation {
    public static void main(String[] args) {
        String txt = "mypensil";
        String target = "ensilmyp";
        System.out.println(checkIfTwoStringIsRotate(txt, target));
    }

    private static boolean checkIfTwoStringIsRotate(String txt, String target) {

        return (txt+target).indexOf(target) !=0;
    }
}
