package com.collection.practicals;

public final class ImmutableClass {
	private final String name;

	public ImmutableClass(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public static void main(String[] args) {
		int a = 2;
		int b = 3;
		int c;

		ImmutableClass im = new ImmutableClass("vipul");
		System.out.println(im.getName());
		im = new ImmutableClass("Vibhuti");
		System.out.println(im.name);

		/*
		 * c = b; b = a; a = c;
		 * 
		 * System.out.println(a); System.out.println(b);
		 */

		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println(a);
		System.out.println(b);

	}

}
