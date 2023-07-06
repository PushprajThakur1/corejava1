package Framwork;

import java.util.ArrayList;

public class TestEmployee {

	public static void main(String[] args) {

		Employee e1 = new Employee(1, "Pushp", 18);
		Employee e2 = new Employee(2, "Rahul", 15);
		Employee e3 = new Employee(3, "shyam", 20);
		Employee e4 = new Employee(4, "dines", 40);
		Employee e5 = new Employee(5, "extra", 15);
		
		System.out.println(e1);
		
		
		ArrayList  list1= new ArrayList ();
		
		list1.add(e1);
		list1.add(e2);
		list1.add(e3);
		list1.add(e4);
		list1.add(e5);
		
		System.out.println(list1);
		
		Employee e = (Employee) list1.get(0);
		
		System.out.println(e.getId());
		System.out.println(e.getName());
		System.out.println(e.getAge());
		

	}

}
