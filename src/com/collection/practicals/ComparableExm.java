package com.collection.practicals;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;


public class ComparableExm {
	public static void main(String[] args) {
		MarksheetComparable m1=new MarksheetComparable("12361","Ram");
		MarksheetComparable m2=new MarksheetComparable("12341","Ram");
		MarksheetComparable m3=new MarksheetComparable("12351","Ram");
		List a1=new ArrayList<>();
		a1.add(m1);
		a1.add(m2);
		a1.add(m3);
		
		Collections.sort(a1);
		Iterator i=a1.iterator();
		while(i.hasNext()) {
			MarksheetComparable e1=(MarksheetComparable)i.next();
			System.out.println(e1.getRollNo());
		}
		
		
		
	}

}
