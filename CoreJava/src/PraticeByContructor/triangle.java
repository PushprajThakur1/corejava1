package PraticeByContructor;

public class triangle extends Shape {
	 private int base ;
	 private int height ;
	 
	 public triangle (int base , int height ) {
		 this.base = base ;
		 this.height = height;
		 
	 }
	  public int getbase() {
		  System.out.println("base = " + base );
		return base;
		
    }
	  public int getheight () {
		  System.out.println("height = " + height);
		return height;
		
    }
	  public double area() {
		  double tarea = base  * height;
		  System.out.println("area of trinagle = " + tarea);
		  return tarea;
		  
	
		  
		  
	  }
	

}
