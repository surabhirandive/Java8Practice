package com.practice.allinterview.questions.test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.stream.Collectors;

public class StreamPrograms {
	public static void main(String[] args) {
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("");
		arrayList.add("Surabhi");
		arrayList.add("Pinky");
		arrayList.add("Sudha");
		arrayList.add("Sakshi");
		arrayList.add("Sakshi");
		arrayList.add("");
		System.out.println(arrayList.stream().filter(p -> p.startsWith("S")).collect(Collectors.toList()));
		System.out.println(arrayList.stream().collect(Collectors.joining(",")));
		System.out.println(arrayList.stream().findFirst());
		System.out.println(arrayList.stream().reduce((first, second) -> second));
		HashSet<String> hashSet = new HashSet<String>();
		System.out.println(arrayList.stream().filter(p -> !hashSet.add(p)).collect(Collectors.toSet()));

		// Counting empty strings

		System.out.println(arrayList.stream().filter(p -> p.isEmpty()).count());
		System.out.println(arrayList.stream().filter(p -> p.length() > 3).count());
		System.out.println(arrayList.stream().filter(p -> p.startsWith("S")).count());
		System.out.println(arrayList.stream().filter(p -> !p.isEmpty()).collect(Collectors.toList()));
		System.out.println(arrayList.stream().filter(p -> p.length() > 2).collect(Collectors.toList()));

		System.out.println(arrayList.stream().filter(p -> !p.isEmpty()).map(p -> p.toUpperCase())
				.collect(Collectors.joining(",")));

		ArrayList<Integer> arrayList1 = new ArrayList<Integer>();
		arrayList1.add(4);
		arrayList1.add(1);
		arrayList1.add(2);
		arrayList1.add(3);

		System.out.println(arrayList1.stream().map(p -> (p * p)).collect(Collectors.toList()));
		System.out.println(arrayList1.stream().mapToInt((x) -> x).summaryStatistics().getMax());

	}

}
