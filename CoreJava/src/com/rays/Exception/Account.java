package com.rays.Exception;

public class Account {

	private int balance = 0;

	public int getBalance() {
		return balance;

	}

	public void setBalance(int balance ) {
		  
		  this.balance = balance ;
		  
	  }

	public void Deposite (int amt) {
		int total = getBalance() + amt;
		setBalance(total);

		System.out.println("Balance After Deposite = " + getBalance());
		
	
		}

	}


