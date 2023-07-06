package com.rays.clone;

public class Account implements Cloneable {

	public int balance = 10;

	public Account(int balance) {

		this.balance = balance;
	}

	public void setBalance(int a) {
		balance = a;

	}

	public int getbalance() {
		return balance;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

}
