package org.java8.effectiveJava.functionalProgramming;

import java.util.ArrayList;

public class MatchEmployee {

    public static void main(String[] args) {
        var list = new ArrayList<Integer>();
        list.add(10);
        list.stream().map(x -> x + 10).forEach(System.out::println);
        callYourDay("MONDAY");
        EmployeeRecord employeeRecord = new EmployeeRecord("Prsahasht", 500,3);
        System.out.println(employeeRecord);
    }

    private static void callYourDay(String day) {
        int numberday;

    }

}
