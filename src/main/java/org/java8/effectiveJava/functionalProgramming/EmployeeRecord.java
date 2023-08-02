package org.java8.effectiveJava.functionalProgramming;

public record EmployeeRecord(String name, int employeeNumber,int exp) {
    public EmployeeRecord {
        if (employeeNumber < 0) {
            throw new IllegalArgumentException("Employee Number cannot be negative");
        }
    }
}
