package com.rays.basics;

public class Stringbuffer {
        public static void main(String[] args){
        	
			StringBuffer sb = new StringBuffer("pushpraj");
			sb.append("thakur");
			
			System.out.println("Length:" + sb.length());
			System.out.println("Capacity:" +sb.capacity());
			System.out.println("char at:" + sb.charAt(1));
			System.out.println(("Index of:" + sb.indexOf("thakur") ));
			System.out.println("Replace:" + sb.replace(0,5,  "pushp"));
			System.out.println("Reverse:" + sb.reverse());
		}        
}
