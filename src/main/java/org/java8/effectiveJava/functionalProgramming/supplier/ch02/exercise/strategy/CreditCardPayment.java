package org.java8.effectiveJava.functionalProgramming.supplier.ch02.exercise.strategy;

import org.java8.effectiveJava.functionalProgramming.supplier.ch02.exercise.PaymentStatus;

import java.math.BigDecimal;


public class CreditCardPayment implements PaymentStrategy {


    @Override
    public PaymentStatus pay(BigDecimal money) {
        System.out.println("Paying by credit card : " + money);
        return PaymentStatus.SUCCESS;
    }

}
