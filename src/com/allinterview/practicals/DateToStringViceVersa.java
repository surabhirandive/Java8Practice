package com.allinterview.practicals;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateToStringViceVersa {
	public static void main(String[] args) throws ParseException {
		Date d = new Date();
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM/dd/yyyy");
		String s = simpleDateFormat.format(d);
		System.out.println(s);
		
		
		String s1="09/12/2019";
		Date d1 = simpleDateFormat.parse(s1);
		System.out.println(d1);
	}

}
