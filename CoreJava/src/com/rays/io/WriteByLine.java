package com.rays.io;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PipedWriter;
import java.io.PrintWriter;

public class WriteByLine {
	
	public static void main(String[] args) throws IOException{
		
		FileWriter out = new FileWriter("C:\\\\\\\\Users\\\\\\\\HP\\\\\\\\Desktop\\\\\\\\RAYS\\\\\\\\Serlaization.txt");
		
		PrintWriter pw = new PrintWriter(out);
		
		for (int i = 0; i < 5; i++) {
			pw.print(i+" :Line");
			
			
		}
		
		pw.close();
		out.close();
		
		System.out.println("C:\\Users\\HP\\Desktop\\RAYS\\Serlaization.txt");
	}

}
