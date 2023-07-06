package Framwork;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;


public class Itretor {
	   
	public static void main(String[] args) {
		
		
		Collection list1 = new ArrayList();
		
		list1.add("Red");
		list1.add("100");
		list1.add("true");
		list1.add("Black");
		list1.add("Red");
		list1.add("100");
		list1.add("true");
		list1.add("Black");
		
		Iterator it = list1.iterator(); 
		
		while(it.hasNext()) {
			
			System.out.println(it.next());
		}
		
		
	}

}
