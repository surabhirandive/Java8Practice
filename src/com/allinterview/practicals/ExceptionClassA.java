package com.allinterview.practicals;

public class ExceptionClassA implements ExceptionInterfaceA {
	public static void main(String[] args) {
		ExceptionInterfaceA o = new ExceptionClassA();
		o.a();

	}

	@Override
	public void a() throws RuntimeException {
		System.out.println(10 / 0);

	}

}
