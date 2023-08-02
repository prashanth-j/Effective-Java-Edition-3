package org.java8.effectiveJava.functionalProgramming.supplier.ch04.exercise;

import org.java8.effectiveJava.functionalProgramming.supplier.ch02.exercise.Item;

import java.math.BigDecimal;


public class ShoppingCartLambdasTest {
	
	public static void main(String[] args) {
		Item item1 = new Item("Phone",BigDecimal.valueOf(200.00));
		Item item2 = new Item("Laptop",BigDecimal.valueOf(800.00));
		Item item3 = new Item("Paper",BigDecimal.valueOf(10.00));
		
		ShoppingCartLambdas shoppingCart = new ShoppingCartLambdas();
		shoppingCart.addItem(item1);
		shoppingCart.addItem(item2);
		shoppingCart.addItem(item3);
	
		//Testing with lambdas (can be improved)
		System.out.println(shoppingCart.pay(money -> Payment.payByCreditCard(money)));
	}

}
