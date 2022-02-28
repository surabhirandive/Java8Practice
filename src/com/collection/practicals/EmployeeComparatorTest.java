package com.collection.practicals;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class EmployeeComparatorTest {
	public static void main(String[] args) {
		EmployeeComparator e1=new EmployeeComparator("Surabhi", "Randive", 76000);
		EmployeeComparator e2=new EmployeeComparator("Surabhi", "Jain", 40000);
		EmployeeComparator e3=new EmployeeComparator("Surabhi", "Sanket", 50000);
		
		List l=new ArrayList();
		l.add(e1);
		l.add(e2);
		l.add(e3);
		EmployeeComparator e=new EmployeeComparator();
		Collections.sort(l,e);
		
		Iterator it=l.iterator();
		while(it.hasNext()){
			EmployeeComparator e11=(EmployeeComparator)it.next();
			System.out.println(e11.getfName()+""+e11.getlName());
		}
		
	}

}
