package com.rays.basics;

public class Arr2 {
	public static void main(String[] args) {
		int[] table = { 2, 4, 6, 8, 10 };
		int[] table2 = new int[5];

		table2[0] = 2;
		table2[1] = 4;
		table2[2] = 6;
		table2[3] = 8;
		table2[4] = 10;

		for (int i : table2) {
			System.out.println(i);
		}
	}
}
