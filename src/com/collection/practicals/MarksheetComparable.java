package com.collection.practicals;

public class MarksheetComparable implements Comparable<MarksheetComparable> {
	private String rollNo;

	private int rollNo1;
	private String name;

	public String getRollNo() {
		return rollNo;
	}

	public void setRollNo(String rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRollNo1() {
		return rollNo1;
	}

	public void setRollNo1(int rollNo1) {
		this.rollNo1 = rollNo1;
	}
	public MarksheetComparable(String rollNo,String name) {
		this.rollNo=rollNo;
		this.name=name;
	}

	public int compareTo(MarksheetComparable m) {
		// Ascending
		return rollNo.compareTo(m.getRollNo());
		// descending
		// return m.getRollNo().compareTo(rollNo);

		// if roll No is int Ascending
		// return rollNo1-m.getRollNo1();

		// if roll No is int Descending
		// m.getRollNo1()-rollNo1;

	}

}
