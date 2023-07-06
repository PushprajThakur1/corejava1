package com.rays.basics;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Datedob {
	
	public static void main(String[] args) throws ParseException {
		String dob = "16/05/2002";
		SimpleDateFormat sdf = new SimpleDateFormat ("dd/MM/yyyy");
		Date d = sdf.parse(dob);
		System.out.println(d);
		
		
		 
	}

}
