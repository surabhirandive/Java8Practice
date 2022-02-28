package com.practice.allinterview.questions.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Marksheet implements Comparable<Marksheet> {
	/* private int marks; */
	private String marks;
	private String name;
	private String address;

	/*
	 * public int getMarks() { return marks; }
	 * 
	 * public void setMarks(int marks) { this.marks = marks; }
	 */

	public String getName() {
		return name;
	}

	public String getMarks() {
		return marks;
	}

	public void setMarks(String marks) {
		this.marks = marks;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	/*
	 * public Marksheet(int marks, String name, String address) { super();
	 * this.marks = marks; this.name = name; this.address = address; }
	 */

	/*
	 * @Override public int compareTo(Marksheet o) { return o.marks - marks;
	 * 
	 * }
	 */
	public int compareTo(Marksheet o) {
		return o.marks.compareTo(marks);

	}

	public Marksheet(String marks, String name, String address) {
		super();
		this.marks = marks;
		this.name = name;
		this.address = address;
	}

	@Override
	public String toString() {

		return marks + "," + name + "," + address;
	}

	public static void main(String[] args) {
		Marksheet o2 = new Marksheet("66", "Sudha", "Mhow");
		Marksheet o = new Marksheet("90", "Surabhi", "Avavsa");
		Marksheet o1 = new Marksheet("56", "Pinky", "Peethampur");
		ArrayList arrayList = new ArrayList();
		arrayList.add(o2);
		arrayList.add(o);
		arrayList.add(o1);

		Collections.sort(arrayList);
		Iterator itr = arrayList.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
