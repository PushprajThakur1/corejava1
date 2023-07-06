package com.rays.basics;

public class Str {
	public static void main(String[] args) {
		String s ="Hello java";
	    int count = 0;
	    char c = 'a';
	    for (int i =0 ; i<s.length (); i++) {
	    	if (s.charAt (i)==c) {
	    		count++;
	    		
	    		System.out.println("count = "+ count );
	    		
	    	}
	    }
	}
}
