package com.rays.thread;

public class WithoutThread {
	
	String name = null;
	
	public WithoutThread(String name ) {
		this.name = name ;
		
	}
	
	public void run () {
		for (int i = 1; 1 <= 10; i++) {
			
			System.out.println(i+ " "+ name);
		}
	}
	

}
