package com.rays.basics;

public class  palindrome {
	public static void main(String[] args) {
		int number = 121;
		int r;
		int sum = 0;
		int n = number;
		while (n > 0) {
			r = n % 10;
			sum = (sum * 10) + r;
			n=n/10;
		}
		if (sum == number) {
			System.out.println("palindrome number " + sum);

		} else {
			System.out.println("not palindrome" + sum);
		}
	}
}