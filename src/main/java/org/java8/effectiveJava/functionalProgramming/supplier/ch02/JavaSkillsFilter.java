package org.java8.effectiveJava.functionalProgramming.supplier.ch02;


import org.java8.effectiveJava.functionalProgramming.supplier.employee.Employee;
import org.java8.effectiveJava.functionalProgramming.supplier.employee.Skill;

public class JavaSkillsFilter implements EmployeeFilter {

	@Override
	public boolean filterEmployee(Employee employee) {
		return employee.getSkills().contains(Skill.JAVA);
	}

}
