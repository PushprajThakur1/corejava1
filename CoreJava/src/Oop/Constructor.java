package Oop;

public class Constructor {
    private String color =null;
    private int borderWidth = 0;
    
    public Constructor() {
    	
    }
    public Constructor (String color ) {
    	this.color =color;
    	
    }
    public Constructor (int borderWidth) {
    	this.borderWidth = borderWidth;
    	
    }
    public Constructor (String color , int borderWidth) {
    	this.color = color;
    	this.borderWidth = borderWidth;
    	
    }
    public String getcolor() {
    	return color;
    	
    }
    public int getborderWidth() {
    	return borderWidth;
    	
    }
}
