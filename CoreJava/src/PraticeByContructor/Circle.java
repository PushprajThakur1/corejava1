package PraticeByContructor;

public class  Circle extends   Shape { 
	private int radius ;
	public static final double PI = 3.14;
	
	public  Circle () {} 
		
		public Circle(int radius ){
			this.radius = radius;
	}
		public int getradius() {
			System.out.println("radius ="+ radius );
			return radius;
			
    }
		public double area() {
			double carea = PI *radius * radius;
			System.out.println("radius of circle = "+ carea);
			return carea;
			
		}

}
