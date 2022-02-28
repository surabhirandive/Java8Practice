package com.allinterview.practicals;

public class OOPConcept {
	public void methodA(Object o) {
		System.out.println("Object");
	}

	public void methodA(String s) {
		System.out.println("String");
	}

	/*
	 * public void methodA(StringBuffer s) { System.out.println("String"); }
	 */
	// string and stringbuffer are not from different hirarchy.So only one of them
	// will work at a time
	public static void main(String[] args) {
		OOPConcept oopConcept = new OOPConcept();
		oopConcept.methodA(null);
		oopConcept.methodA("null");

	}
	// Because,resolving the overloaded method compiler will always gives precedence
	// to child class when compared with parent ..
	// o/p string

}
