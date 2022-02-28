package com.allinterview.practicals;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FinalArrayListTest {

	public static void main(String[] args) {

		// This means that you cannot rebind the variable to point to a different
		// collection instance:

		/*
		 * final List<Integer> list = new ArrayList<Integer>(); list = new
		 * ArrayList<Integer>();
		 */

		List<Integer> list = new ArrayList<Integer>();
		list = new ArrayList<Integer>();
		final List<Integer> list1 = Collections.unmodifiableList(new ArrayList<Integer>());
		/*
		 * list1.add(12); list1.add(34);
		 */
		System.out.println(list1);
		//java.lang.UnsupportedOperationException
		
		
		
		   // creating object of ArrayList<Character>
        List<Character> list11 = new ArrayList<Character>();

        // populate the list
        list11.add('X');
        list11.add('Y');

        // printing the list
        System.out.println("Initial list: " + list11);

        // getting unmodifiable list
        // using unmodifiableList() method
        List<Character> immutablelist = Collections
                                            .unmodifiableList(list11);

        // printing the list
        System.out.println("Unmodifiable list: "
                           + immutablelist);
	

	}

}
