package com.practice.allinterview.questions.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class MarksheetComparator implements Comparator<MarksheetComparator> {
	private String marks;
	private String fName;
	private String lName;

	public String getMarks() {
		return marks;
	}

	public void setMarks(String marks) {
		this.marks = marks;
	}

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

	public MarksheetComparator(String marks, String fName, String lName) {
		super();
		this.marks = marks;
		this.fName = fName;
		this.lName = lName;

	}

	public MarksheetComparator() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return fName + "," + lName + "," + marks;
	}

	public static void main(String[] args) {

		MarksheetComparator o2 = new MarksheetComparator("66", "Surabhi", "Sankat");
		MarksheetComparator o = new MarksheetComparator("90", "Surabhi", "Randive");
		MarksheetComparator o1 = new MarksheetComparator("56", "Surabhi", "Jain");
		ArrayList arrayList = new ArrayList();
		arrayList.add(o2);
		arrayList.add(o);
		arrayList.add(o1);

		MarksheetComparator eComparator = new MarksheetComparator();

		Collections.sort(arrayList, eComparator);

		Iterator it = arrayList.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

	}

	@Override
	public int compare(MarksheetComparator o1, MarksheetComparator o2) {
		if (o1.fName.equals(o2.fName)) {
			return o1.lName.compareTo(o2.lName);
		} else {
			return o1.lName.compareTo(o2.lName);
		}
	}

}
