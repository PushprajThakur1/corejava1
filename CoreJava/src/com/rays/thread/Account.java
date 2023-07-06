package com.rays.thread;

public class Account {
	public String thakur ;
	private int balance = 0;
	

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	public void deposit (String name, int amt ) {
		
		int bal = getBalance();
		bal = bal + amt ;
		setBalance(bal);
		System.out.println(name + " new balance " + bal);
	}

	
	

}
