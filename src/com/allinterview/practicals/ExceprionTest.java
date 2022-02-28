package com.allinterview.practicals;

public class ExceprionTest {
	public static void main(String[] args) {
		try {
			System.out.println("Hi");
			System.out.println("Bye");
			return;
		} catch (Exception e) {

		} finally {
			System.out.println("Inside finally");
		}
	}
}
