package com.rays.Exception;

public class MultipalCatchBlock {
	
	public static void main(String[] args) {
		
		String name = "vijay";
		 
		
		try {
			System.out.println(100/0);
			System.out.println("Length = " + name.length());
			System.out.println("charcter =" + name.charAt(1));
			
			
		} catch (StringIndexOutOfBoundsException e) {
			
			System.out.println("String Ex = " + e.getMessage());
			
		}  catch (NullPointerException e ) {
			
			System.out.println("Null Ex = " + e.getMessage());
			
			
		}catch (Exception e) {
		 System.out.println(("Exp ex = " + e.getMessage()));
		}
	
			
		}
	}
	
	


