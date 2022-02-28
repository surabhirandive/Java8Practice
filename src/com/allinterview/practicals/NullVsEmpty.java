package com.allinterview.practicals;

public class NullVsEmpty {
	public static void main(String[] args) {
		System.out.println(null == "");
		System.out.println("".equals(null));
		NullVsEmpty nullVsEmpty = new NullVsEmpty();
		nullVsEmpty.test(null);

	}

	void test(Object o) {
		System.out.println("Object o");
	}

	void test(Integer i) {
		System.out.println("Integer");
	}

}
