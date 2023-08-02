package org.java8.effectiveJava.item39.annotation;

public class B {
    public static void main(String[] args) {
        double d = 10.0 / -0;
        if(d == Double.POSITIVE_INFINITY){
            System.out.println("po");
        }
        else{
            System.out.println("neg");
        }
    }
}
