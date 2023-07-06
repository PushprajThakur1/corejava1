package com.rays.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Scanner1 {
	
	public static void main(String[] args) throws IOException {
		
		FileReader reader = new FileReader ("C:\\\\Users\\\\HP\\\\Desktop\\\\RAYS\\\\Serlaization.txt");
		Scanner sc = new Scanner (reader);
		
		while (sc.hasNext()) {
			System.out.println(sc.nextLine());
			
		}
		
		reader.close();
		
	}

}
