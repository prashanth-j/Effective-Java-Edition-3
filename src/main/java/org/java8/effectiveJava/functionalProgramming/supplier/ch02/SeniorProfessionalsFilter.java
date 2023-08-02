package org.java8.effectiveJava.functionalProgramming.supplier.ch02;


import org.java8.effectiveJava.functionalProgramming.supplier.employee.Employee;

public class SeniorProfessionalsFilter implements EmployeeFilter {

	@Override
	public boolean filterEmployee(Employee employee) {
		return employee.getExperience() > 10;
	}

}
