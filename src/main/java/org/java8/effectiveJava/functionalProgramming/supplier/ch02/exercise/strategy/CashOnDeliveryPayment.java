package org.java8.effectiveJava.functionalProgramming.supplier.ch02.exercise.strategy;

import org.java8.effectiveJava.functionalProgramming.supplier.ch02.exercise.PaymentStatus;

import java.math.BigDecimal;


public class CashOnDeliveryPayment implements PaymentStrategy {

	
	public PaymentStatus pay(BigDecimal money) {
		System.out.println("Paying by cash on delivery : " + money);
		return PaymentStatus.PENDING;
	}
	
	

}
