package com.collection.practicals;

import java.util.Comparator;

public class EmployeeComparator implements Comparator<EmployeeComparator> {
	private String fName;
	private String lName;
	private int salary;

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public EmployeeComparator(String fName, String lName, int salary) {
		this.fName = fName;
		this.lName = lName;
		this.salary = salary;

	}

	@Override
	public int compare(EmployeeComparator s1, EmployeeComparator s2) {
		if (s1.fName.equals(s2.fName)) {
			return s1.lName.compareTo(s2.lName);
		} else {
			return s1.fName.compareTo(s2.fName);
		}

	}

	public String toString() {
		return fName + "" + lName;
	}

	public EmployeeComparator() {

	}

}
