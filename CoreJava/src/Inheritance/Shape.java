package Inheritance;

public class Shape {
	private String color = null;
	private int borderWidrth = 0;
	private int borderWidth;
	
	public void setcolor (String color ) {
		this.color = color ;
		
	}
	public String  getcolor () {
		return color;
		
	}
	public void setborderWidth (int borderWidth) {
		this.borderWidrth = borderWidth;
		
	}
	public int getborderWidth () {
		return borderWidth;
		
    }
	public double area() {
		System.out.println("Shape area method ");
		return area();
		
	}

}
