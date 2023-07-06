package com.rays.io;

import java.io.FileReader;

public class TextReader {

	
	public static void main(String[] args)throws Exception {
		
		FileReader in = new FileReader ("C:\\Users\\HP\\Desktop\\RAYS\\core.txt");
		
		int ch = in.read();
		while (ch != -1) {
		System.out.print((char)ch);
		
		ch = in.read();
		
	}
}
}
