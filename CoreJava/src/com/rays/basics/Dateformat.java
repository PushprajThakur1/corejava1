package com.rays.basics;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Dateformat {
	public static void main(String[] args) {
	Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println(d);

		String s = sdf.format(d);
		System.out.println(s);
	}
}
