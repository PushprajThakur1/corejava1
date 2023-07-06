package com.rays.thread;

public class TestWithoutThread {
	
	public static void main(String[] args) {
		
		WithoutThread w1 = new WithoutThread("pushpraj");
		WithoutThread w2 = new WithoutThread("Jai Shree Ram");
		
		w1.run();
		w2.run();
	}

}
