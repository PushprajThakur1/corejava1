package com.rays.clone;

public class Customer implements Cloneable {

	public String name = null;

	public Account account = null;

	Customer() {
	}

	Customer(String name) {
		this.name = name;
		this.account = new Account(10);

	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		Customer c = (Customer) super.clone();
		c.account = (Account) account.clone();
		return c;
	}

}