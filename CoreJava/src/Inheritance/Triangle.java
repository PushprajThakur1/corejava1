package Inheritance;


public class Triangle extends Shape  {
	 private int height ;
	 private int base ;
	 
	 public void setheight (int height ) {
		 this.height = height;
		 
	 }
	 public int getlength () {
		 return height;
		 
	 }
	 public void setbase (int base ) {
		 this.base = base ;
		 
	 }
	  public int getbase() {
		  return base;
		  
	  }
	  public double area() {
		  int tarea = (base * height );
		  System.out.println("area of triangle =" + tarea);
		  return tarea ;
	  }
	  

}
