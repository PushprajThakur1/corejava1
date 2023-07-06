package Framwork;

public class Employee3 {

	private int id;
	private String name;
	private int age;
	private boolean flase;

	public Employee3(int id, String name, int age) {

		this.id = id;
		this.name = name;
		this.age = age;
	}

	public void setId(int id) {
		this.id = id;

	}

	public int getId() {
		return id;

	}

	public void setName(String name) {
		this.name = name;

	}

	public String getname() {
		return name;

	}

	public void setAge(int age) {
		this.age = age;

	}

	public int getAge() {
		return age;
		
	}
	
	   @Override
	public String toString() {
		return this.id + " " + this.name + " " + this.age ;
		
	}
	   
	  public boolean equals (Object o) {
		  if ( o== null) {
		return false;
	
	  }
		  if (!(o instanceof Employee3)) {
			  return false;
			  
		  }
		  
		  Employee3 e = (Employee3) o;
		  
		  if(this.id == e.id && this.name == e.name && this.age == e.age){
			  return true ; 
	  }else {
		  return flase ;
		  
	  }
		  
	  }
	  
	   //  return this.name == e.name && this.id == e.id && this.age == e.age 
	

       @Override
    public int hashCode() {
    	return id.hashcode()+ name.hashCode()+ age.hashcode(;)    }
        	
        }
