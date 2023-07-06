package com.rays.basics;

public class Strbuffer {
	public static void main(String[] args) {
		String s1 = "Java";
		String s2 = "Java";
		String s3 = new String (" core");
		String s4 = new String ("core");
		
		StringBuffer sb = new StringBuffer ("Hello");
		 
		sb.append("java ");
		sb.append(" hello");
		
		System.out.println(sb.append(s4));
		
		
		
	}

}
