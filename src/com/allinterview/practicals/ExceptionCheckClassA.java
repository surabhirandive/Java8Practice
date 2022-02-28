package com.allinterview.practicals;

public class ExceptionCheckClassA implements ExceptionCheckInterfaceA {
	public static void main(String[] args) {
		ExceptionCheckInterfaceA o = new ExceptionCheckClassA();
		o.a();
	}

	@Override
	public void a() throws NullPointerException {
		// TODO Auto-generated method stub
		
	}

	/*
	 * @Override public void a() throws Exception {
	 * 
	 * }
	 */

	// Exception Exception is not compatible with throws clause in
	// ExceptionCheckInterfaceA.a()

}
