package org.java8.effectiveJava.functionalProgramming.supplier.ch02;


import org.java8.effectiveJava.functionalProgramming.supplier.employee.Employee;
import org.java8.effectiveJava.functionalProgramming.supplier.employee.Unit;

public class EDCFilter implements EmployeeFilter {

	@Override
	public boolean filterEmployee(Employee employee) {
		return employee.getUnit()== Unit.EDC;
	}

}
