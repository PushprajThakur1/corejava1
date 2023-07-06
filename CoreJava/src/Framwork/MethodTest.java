package Framwork;

import java.util.ArrayList;

public class MethodTest {
	
	public static void main(String[] args) {
		
		ArrayList list1 = new ArrayList ();
		
		list1.add("black");
		list1.add("10");
		list1.add("red");
		
		System.out.println(list1);
		
		
		ArrayList list2  = new ArrayList ();
		
		list2.add("jai ho");
		list2.add("jai shree ram ");
		
		
		list2.addAll(list1);
		
		System.out.println(list2);
		
		list1.clear();
		
		System.out.println(list1);
		
		list1.contains(list2);
		
		System.out.println(list1.contains(list2));
		
		list2.containsAll(list1);
		
		System.out.println(list2.containsAll(list1));
		
		list2.isEmpty();
		
		System.out.println("Empty  = " +list1.isEmpty());
		
		list2.iterator();
		
		System.out.println(list1);
		
		
		System.out.println(list2.remove(2));
		
		System.out.println(list2.removeAll(list1));
		
		System.out.println(list2.size());
		
		
		
		
		
		
		
	}
	
	

}
