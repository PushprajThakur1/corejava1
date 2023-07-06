package com.rays.basics;

public class Copyanarray {
	public static void main(String[] args) {
		int[][] table1 = new int[5][5];
		table1 [0][0]=1;
		table1 [0][1]=2;
		table1 [0][2]=3;
		table1 [0][3]=4;
		table1 [0][4]=5;
		
		table1 [1][0]=1;
		table1 [1][1]=2;
		table1 [1][2]=3;
		table1 [1][3]=4;
		table1 [1][4]=5;
		
		table1 [2][0]=1;
		table1 [2][1]=2;
		table1 [2][2]=3;
		table1 [2][3]=4;
		table1 [2][4]=5;
		
		table1 [3][0]=1;
		table1 [3][1]=2;
		table1 [3][2]=3;
		table1 [3][3]=4;
		table1 [3][4]=5;
		
		table1 [4][0]=1;
		table1 [4][1]=2;
		table1 [4][2]=3;
		table1 [4][3]=4;
		table1 [4][4]=5;
		 
		for (int [] is : table1) {
			System.out.println(' ');
			
			for (int  i: is ) {
				System.out.print(i+"\t");
				
			}
			System.out.println();
		}
		
		

	}

}
