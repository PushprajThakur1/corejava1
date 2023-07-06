package Framwork;

import java.util.ArrayList;

public class TestEmployee3 {
	
	public static void main(String[] args) {
		
		Employee3 e1 = new Employee3(1, "pushpraj", 18);
		Employee3 e2 = new Employee3(2, "rahul", 12);
		Employee3 e3 = new Employee3(3, "Har har mahadev", 13);
		Employee3 e4 = new Employee3(4, "jai shree ram", 14);
		Employee3 e5 = new Employee3(5, "thakur", 15);
		
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e3);
		System.out.println(e4);
		System.out.println(e5);
		
		ArrayList  list = new ArrayList();
		
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		list.add(e5);
		
		//System.out.println(list);
		
		
		//Employee3 e = (Employee3)list.get(1);
		//System.out.println(e);
		
	}

}
