package Oop;

import java.util.Date;

public class Person {
	
	private String str = null;
	private Date d = null;
	private String address = null;
	public static int AVG_AGE = 10;
	
	
	public void setstr(String c) {
		str = c;
		
	}
	public String getStr() {
		return str;
		
	}
	public void SetD(Date e) {
		d = e;
		
	}
	public Date getD(){ 
		return d;
		
		}
     public void setAddress(String d) {
    	 address = d;
    	 
     }
     public String getAddress() {
    	 return address;
    	 
     }
     public int getAVG_AGE() {
    	 return AVG_AGE;
    	 
     }
}
