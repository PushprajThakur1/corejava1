package Framwork;

import java.util.Enumeration;
import java.util.Vector;

public class TestVector {
	
	public static void main(String[] args) {
		
		
		Vector list1 = new Vector ();
		
		list1.add("Red");
		list1.add("100");
		list1.add("true");
		list1.add("Black");
		list1.add("Red");
		list1.add("100");
		list1.add("true");
		list1.add("Black");
		
		Enumeration  v = list1.elements();
		
		while (v.hasMoreElements()) {
			
			System.out.println(v.nextElement());
			
		}
	}

}
