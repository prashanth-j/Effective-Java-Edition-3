package org.java8.effectiveJava.functionalProgramming;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
@AllArgsConstructor
public class Employee {
    int id;
    String name;
    String address;
    LocalDateTime joiningDate;
}
