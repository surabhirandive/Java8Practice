package com.collection.practicals;

public class OccuenceOfChar {
	public static void main(String[] args) {
		String str="Surabhi Randive";
		int count = 0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='a') {
				count++;
			}
		}
		System.out.println(count);
	}

}
