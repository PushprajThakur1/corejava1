package Inheritance;

import PraticeByContructor.triangle;

public class TestClass {
	
	public static void main(String[] args) {
		Shape[]s = new Shape[3];
		s[0] = new Rectangle();
		Rectangle r =( Rectangle)s[0];
		r.setlength(10);
		r.setBreadth(15);
		
		
		s[1] = new Triangle();
		Triangle t = (Triangle)s[1];
		t.setbase(10);
		t.setheight(10);
		
		
		s[2] = new Circle();
		Circle c = (Circle)s[2];
		c.setradius(10);
		
		
		double totalarea = 0;
		for (int i = 0; i < s.length; i++) {
			totalarea = totalarea + s[i].area();
			
		}
		System.out.println("totalarea = "+ totalarea);
		
		
		}
	

}
