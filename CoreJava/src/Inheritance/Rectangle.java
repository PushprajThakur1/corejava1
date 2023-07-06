package Inheritance;

public class Rectangle extends Shape {
	private int length ;
	private int Breadth ;
	 
	public void setlength (int length ) {
		this.length = length;
		
	}
	public int  getlength () {
		return length;
		
	}
	public void setBreadth (int Breadth) {
		this.Breadth = Breadth;
		
	}
	public int getBreadth () {
		return Breadth ;
		
	}
	public  double area () {
		int rarea = length * Breadth;
		System.out.println("area of rectangle " + rarea);
		return rarea;
	}

}
