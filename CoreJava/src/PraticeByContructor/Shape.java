package PraticeByContructor;
public class Shape {
	private String Color = null;
	private int borderWidth = 0;
	
	public Shape() {
	}

	public Shape(String color, int borderWidth) {
		this.Color = color;
		this.borderWidth = borderWidth;

	}

	public String getcolor() {
		System.out.println("getcolor");
		return Color;

	}

	public int getborderWidth() {
		System.out.println(borderWidth);
		this.borderWidth = borderWidth;
		return borderWidth;
	
	}
	public double area() {
		return 0;

	}
}
