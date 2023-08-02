package org.java8.effectiveJava.functionalProgramming.supplier.employee;

public enum Unit {

	FS("Financial Services"), 
	EDC("Extended Centre"), 
	OIL_GAS("Oil & Gas");

	private String unitName;

	private Unit(String name) {
		this.unitName = name;
	}
	
	public String getUnitName() {
		return unitName;
	}

}
