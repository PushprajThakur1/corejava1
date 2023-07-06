package com.rays.clone;

public class TestCustomer {
	public static void main(String[] args) throws CloneNotSupportedException {

		Customer c1 = new Customer("ram");

		Customer c2 = (Customer) c1.clone();

		c2.setName("harsh");
		c2.account.setBalance(30);

		System.out.println(c1.getName());
		System.out.println(c1.account.getbalance());

		System.out.println(c2.getName());
		System.out.println(c2.account.getbalance());

	}
}
