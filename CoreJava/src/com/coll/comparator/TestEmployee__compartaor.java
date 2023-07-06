package com.coll.comparator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class TestEmployee__compartaor {

	public static void main(String[] args) {
		
		
		Employee__Compartor e1 = new Employee__Compartor(1, "ram" , 29);
		Employee__Compartor e2 = new Employee__Compartor(2, "shaym" , 11);
		Employee__Compartor e3 = new Employee__Compartor(3, "pagal" , 44);
		Employee__Compartor e4 = new Employee__Compartor(4, "macchar" , 23);
		Employee__Compartor e5 = new Employee__Compartor(5, "gawar" , 295);
		
		ArrayList l1 = new  ArrayList();
		
		l1.add(e1);
		l1.add(e2);
		l1.add(e3);
		l1.add(e4);
		l1.add(e5);
		
		System.out.println(l1);
		
		Collections.sort(l1 ,new orderByName());
		for (Object o1 : l1) {
			System.out.println("Sorting by Name : " +o1);
		}
		
		System.out.println("*****************");
		
		Collections.sort(l1 , new orderById());
		for (Object o1 : l1) {
			System.out.println("Sorting by Id : " +o1);
		
		}
		
		System.out.println("**************");
		
		Collections.sort(l1 , new orderByAge());
		for (Object o1 : l1) {
			System.out.println("Sorting by Age : " + o1);
          
		}
		
	}
}
