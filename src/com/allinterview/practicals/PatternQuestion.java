package com.allinterview.practicals;

public class PatternQuestion {
	public static void main(String[] args) {
		/*
		 * for(int i=1;i<=5;i++) { for(int j=1;j<=i;j++) { System.out.print(i); }
		 * System.out.println(); }
		 */
		/*
		 * for (int i = 5; i >= 1; i--) { for (int j = 5; j >= i; j--) {
		 * System.out.print(i);
		 * 
		 * } System.out.println(); }
		 */

		/*
		 * for (int i = 5; i >= 1; i--) { for (int j = 1; j < i; j++) {
		 * System.out.print(i); } System.out.println(i); }
		 */
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");

			}
			System.out.println();
		}
		for (int k = 4; k >= 1; k--) {
			for (int l = 1; l <= k; l++) {
				System.out.print("*");
			}
			System.out.println();

		}

	}

}
