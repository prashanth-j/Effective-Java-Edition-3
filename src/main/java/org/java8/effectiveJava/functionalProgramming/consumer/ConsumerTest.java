package org.java8.effectiveJava.functionalProgramming.consumer;

import org.java8.effectiveJava.functionalProgramming.EmployeeRecord;

import java.util.Objects;
import java.util.function.Consumer;

public class ConsumerTest {

    public static void main(String[] args) {
        EmployeeRecord employeeRecord = new EmployeeRecord("Prashanth", 500, 3);
        // employeeConsumer.accept(employeeRecord);
        //  performOperationWithLambda(employeeRecord, employeeConsumer);

        Consumer<EmployeeRecord> empUpperCase = (EmployeeRecord emp) -> System.out.println(emp.name().toUpperCase());

        Consumer<EmployeeRecord> printConsumer = (s) -> System.out.println(s);
        Consumer chained = empUpperCase.andThen(printConsumer);
        chained.accept(employeeRecord);
    }

    private static void printData(EmployeeRecord employeeRecord) {
        System.out.println(employeeRecord);
    }

    private static Consumer<? extends EmployeeRecord> changeCaseAndPrint(EmployeeRecord employeeRecord) {
        return (emp) -> employeeRecord.name().toUpperCase();
    }

    private static void performOperationWithLambda(EmployeeRecord lambda, Consumer<EmployeeRecord> employeeConsumer) {
        if (Objects.nonNull(lambda)) employeeConsumer.accept(lambda);
    }

    private static void storeInDb(EmployeeRecord employee) {
        if (Objects.nonNull(employee))
            System.out.println("Saving employee in db " + employee);
    }
}
