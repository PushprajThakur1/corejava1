package com.rays.Exception;

public class TestInsuff {
    
	public static void main(String[] args) throws Exception {
		
		try {
			
			int balance = 1900;
			
			if (balance <2000) {
				throw new  InsufficentBalance ();
				
				
			}
			
		} catch (Exception e) {
			
			System.out.println(e.getMessage());
			
			
		}
	}
}
