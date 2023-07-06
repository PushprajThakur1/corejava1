package PraticeByContructor;

public class Rectangle extends Shape {
	private int length;
	private int breadth;
	
	public Rectangle (int length , int breadth ) {
		this.length = length ;
		this.breadth= breadth ;
		
	}
	public int getlength () {
		System.out.println("length = "+ length);
		return length;
		
	}
	public int getbreadth() {
		System.out.println("bradth = " + breadth);
		return breadth;
		
	}
	public double area () {
		int rarea = length * breadth;
		System.out.println("area of rectangle = " + rarea );
		return rarea;
		
	}

}
