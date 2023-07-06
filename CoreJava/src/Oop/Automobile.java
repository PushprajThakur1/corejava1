package Oop;

public class Automobile {
     private String color = null;
     private int speed =  0;
     private String make = null;
     private static int $NO_OF_GEARS = 10;
     private int accelerator= 0;
     private int changegear = 0;
     
    public void setolor (String c) {
    	color = c;
    	
    }
    
    public String getcolor() {
    	return color;
    
    }
    
    public void setspeed (int s) {
    	speed = s;
    	
    }
    
    public int getspeed () {
    	return speed;
    	
    }
    
    public void setmake(String m) {
    	make = m;
    	
    }
    
    public String getmake () {
    	return make;
    	
    }
    
    public void set$NO_OF_GEARS(int n ) {
    	$NO_OF_GEARS = n;
    	
    }
     public int get$NO_OF_GEARS() {
    	 return $NO_OF_GEARS;
    	 
     }
     public void  setaccelerator(int a) {
    	 accelerator = a;
    	 
    }
     
     public int getaccelerator() {
    	 return accelerator;
    	 
    }
     
     public void setchangegear (int cg) {
    	 changegear = cg;
    	 
     }
     public int getchangegear() {
    	 return changegear;
    	 
     }
}
