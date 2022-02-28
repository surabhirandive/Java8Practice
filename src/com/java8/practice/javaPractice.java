package com.java8.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collectors;

public class javaPractice {
	public static void main(String[] args) {
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("Surabhi");
		arrayList.add("Ketki");
		arrayList.add("Shivani");
		arrayList.add("Surabhi");
		System.out.println(arrayList);
		System.out.println(arrayList.stream().filter(p -> p.startsWith("S")).collect(Collectors.toList()));
		System.out.println(arrayList.stream().sorted().collect(Collectors.toList()));
		System.out.println(arrayList.stream().filter(p -> p.startsWith("S")).collect(Collectors.counting()));
		System.out.println(arrayList.stream().collect(Collectors.toSet()));
		System.out.println(arrayList.stream().filter(p -> p.equals("Ketki")).findFirst());
		System.out.println(
				arrayList.stream().filter(p -> Collections.frequency(arrayList, p) > 1).collect(Collectors.toSet()));
		System.out.println(arrayList.stream().collect(Collectors.joining(",")));

		ArrayList<Integer> intArrayList = new ArrayList<Integer>();
		intArrayList.add(5);
		intArrayList.add(3);
		intArrayList.add(4);
		intArrayList.add(2);

		System.out.println(intArrayList.stream().filter(p -> p % 2 == 0).map(p -> p * 2).collect(Collectors.toList()));
	}

}
