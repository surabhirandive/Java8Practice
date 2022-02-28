package com.allinterview.practicals;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.TreeMap;
import java.util.TreeSet;

public class HashMapExample {
	public static void main(String[] args) {
		HashMap hashMap = new HashMap();
		hashMap.put("null", "null");
		hashMap.put("null", "check");
		System.out.println(hashMap.get("null"));

		HashSet hashSet = new HashSet();
		hashSet.add("null");
		hashSet.add("null");
		hashSet.add("z");
		hashSet.add("x");
		System.out.println(hashSet);

		TreeSet treeSet = new TreeSet();
		treeSet.add("null");
		treeSet.add("null");
		treeSet.add("z");
		treeSet.add("x");
		System.out.println(treeSet);

		ArrayList arrayList = new ArrayList();
		arrayList.add("null");
		arrayList.add("null");
		System.out.println(arrayList);

		LinkedList linkedList = new LinkedList();
		linkedList.add("null");
		linkedList.add("null");
		System.out.println(linkedList);

		TreeMap treeMap = new TreeMap();
		treeMap.put("null", "test");
		treeMap.put("null", "check1");
		System.out.println(treeMap);

	}

}
