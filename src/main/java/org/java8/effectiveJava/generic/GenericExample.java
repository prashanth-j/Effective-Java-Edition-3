package org.java8.effectiveJava.generic;

import org.java8.effectiveJava.functionalProgramming.EmployeeRecord;

import java.util.List;
import java.util.function.Predicate;

public class GenericExample {
    public static void main(String[] args) {
        print("hello");
        print(new GenericExample());
        List<EmployeeRecord> employeeList = List.of(new EmployeeRecord("a", 1, 8),
                new EmployeeRecord("b", 2, 3),
                new EmployeeRecord("c", 3, 4),
                new EmployeeRecord("d", 4, 8));
        Printer printer = new Printer(employeeList);

        System.out.println(employeeList);
        printer.printValue();
        printList(employeeList);
        //cannot modify the element in records due to immutable property
        employeeList.removeIf(GenericExample::filterEmployeeBasedOnExp);
        printList(employeeList);
    }

    private static boolean filterEmployeeBasedOnExp(EmployeeRecord employeeRecord) {
        Predicate<EmployeeRecord> filter = (emp) ->  emp.exp() > 5;
        return filter.test(employeeRecord);
    }

    private static <T> void print(T t) {
        System.out.println("here we go--" + t);
    }

    private static <T> void printList(List<? extends EmployeeRecord> t) {
        System.out.println("here we go--" + t);
    }

    @Override
    public String toString() {
        return "GenericExample{}";
    }
}
