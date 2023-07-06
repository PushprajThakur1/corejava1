package Oop;

public class Person1 {
    private String name = "PUSHPRAJ";
    private String address = "indore";
    
    public Person1 () {
    	System.out.println();
   }
    
    public void SetString (String s) {
    	s = name ;
    	
    }
    public String getString () {
    	return name;
    	
    }
    
    public void SetAddress (String s) {
         s = address;
         
    }
    
    public String getAddress() {
    	return address;
    	
    }
    
}
