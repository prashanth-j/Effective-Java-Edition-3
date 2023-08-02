package org.java8.effectiveJava.functionalProgramming.supplier.ch02.exercise.strategy;

import org.java8.effectiveJava.functionalProgramming.supplier.ch02.exercise.PaymentStatus;

import java.math.BigDecimal;


public interface PaymentStrategy {
	
	public PaymentStatus pay(BigDecimal money);

}
