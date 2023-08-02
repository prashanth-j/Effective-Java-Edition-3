package org.java8.effectiveJava.generic;

import java.util.List;

public class Printer<T extends List> {

    private T valueToPrint;

    public Printer(T valueToPrint) {
        this.valueToPrint = valueToPrint;
    }

    public void printValue() {
        System.out.println("passed value " + valueToPrint);
    }
}
