package org.java8.effectiveJava.functionalProgramming.ch06;



import org.java8.effectiveJava.functionalProgramming.supplier.employee.Employee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class EmployeeService {	
	
	public List<Employee> getEmployeesFilteredBy(Predicate<Employee> filter) {

		List<Employee> employees = EmployeeUtil.initialize();
		
		List<Employee> filteredEmployee = new ArrayList<>();
		for (Employee employee : employees) {
			if (filter.test(employee)) {
				filteredEmployee.add(employee);
			}
		}
		return filteredEmployee;
	}
	
	
	//retrieve a list of employees that are sorted alphabetically by name
	public List<Employee> sortByName(){
		List<Employee> employees = EmployeeUtil.initialize();
		employees.sort((Comparator<? super Employee>) EmployeeSorterFinal.BY_NAME_ALPHA);
		return employees;
	}
	
	/**Sort the employees with increasing experience and if they have the same experience, 
	then we sort them alphabetically by name.*/
	
	public List<Employee> sortByInreasingExpAndThenName(){
		List<Employee> employees = EmployeeUtil.initialize();
		employees.sort((Comparator<? super Employee>) EmployeeSorterFinal.BY_ASC_EXP_THEN_NAME);
		return employees;
	}
	
	/**
	 * Sort  the employees with decreasing experience 
	 * and if they have the same experience, then we sort them alphabetically by name.
	 */
	public List<Employee> sortByDecreasingExpAndThenName(){
		List<Employee> employees = EmployeeUtil.initialize();
		employees.sort((Comparator<? super Employee>) EmployeeSorterFinal.BY_DESC_EXP_THEN_NAME);
		return employees;
	}
	
	/**
	 * Exercise
	 * Top 3 methods can be combined into one.
	 * @param sorter - Pass behavior
	 * @return -Sorted list.
	 */
	public List<Employee> getEmployees(Comparator<Employee> sorter){
		List<Employee> employees = EmployeeUtil.initialize();
		Collections.sort(employees,sorter);
		return employees;
	}

}
