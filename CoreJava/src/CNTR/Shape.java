package CNTR;

public class Shape {
	  private String  color = null;
	  private int borderWdith = 0;
	  
	  public Shape() {}
		  
		  public Shape (String color , int borderWidth) {
			  this.color = color;
			  this.borderWdith = borderWidth;
			  
		 }
		  public String getcolor() {
			  System.out.println("getcolor");
			  return color;
			  
		  }
		  
		  public int borderWidth() {
			  System.out.println("borderWdith");
			 
			return borderWdith;
			
			  
		  }
		  public double area() {
			return 0;
			  
		  }
		  
		  
	  
	  

}
