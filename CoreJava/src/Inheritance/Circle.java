package Inheritance;

public class Circle extends Shape {
	  private int radius ;
	  public static final double PI = 3.14;
	  
	  public void setradius (int radius ) {
		  this.radius = radius;
		  
	  }
	  public int getradius () {
		  return radius;
		  
	  }
	  public double area() {
		  double Carea = PI * radius * radius;
		  System.out.println("radius of circle "+ Carea);
		return Carea;
	  }

}
