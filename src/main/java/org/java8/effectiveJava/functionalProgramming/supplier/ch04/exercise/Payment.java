package org.java8.effectiveJava.functionalProgramming.supplier.ch04.exercise;

import org.java8.effectiveJava.functionalProgramming.supplier.ch02.exercise.PaymentStatus;

import java.math.BigDecimal;


public class Payment {

	public static PaymentStatus payByCreditCard(BigDecimal money) {
		System.out.println("Paying by credit card : " + money);
		return PaymentStatus.SUCCESS;
	}

	public static PaymentStatus payByDebitCard(BigDecimal money) {
		System.out.println("Paying by debit card : " + money);
		return PaymentStatus.SUCCESS;
	}

	public static PaymentStatus cashOnDelivery(BigDecimal money) {
		System.out.println("Paying by cash on delivery : " + money);
		return PaymentStatus.PENDING;
	}

}
