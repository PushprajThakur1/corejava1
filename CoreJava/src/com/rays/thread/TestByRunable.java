package com.rays.thread;

public class TestByRunable {
	
	public static void main(String[] args) {
		
		Thread t1 = new Thread (new ByRunable("Pushpraj"));
		Thread t2 = new Thread (new ByRunable("Jai Shree Ram"));
		
		t1.start();
		t2.start();
		
		for (int i = 0; i <50; i++) {
			System.out.println("main");
			
		}
	}

}
