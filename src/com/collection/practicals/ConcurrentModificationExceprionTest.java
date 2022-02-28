package com.collection.practicals;

import java.util.ArrayList;
import java.util.Iterator;

public class ConcurrentModificationExceprionTest {
	public static void main(String[] args) {
		ArrayList l=new ArrayList();
		l.add("Surabhi");
		l.add("Randive");
		Iterator it=l.iterator();
		//java.util.ConcurrentModificationException
		//l.remove(1);
		while(it.hasNext()) {
			System.out.println(it.next());
			it.remove();
			System.out.println("H"+it.next());
		}
	}

}
