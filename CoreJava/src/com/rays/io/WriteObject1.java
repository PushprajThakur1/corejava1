package com.rays.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObject1 {
	
	public static void main(String[] args) throws Exception {
		  
		FileOutputStream file = new FileOutputStream("C:\\Users\\HP\\Desktop\\RAYS\\Serlaization.txt");
		ObjectOutputStream out = new ObjectOutputStream(file);
		
		Marksheet  m = new Marksheet();
		m.name = "pushpraj";
		m.chemistry = 90 ;
		m.maths = 80 ;
		m.physic = 87 ;
		
		
		out.writeObject(m);
		out.close();
		file.close();
		System.out.println(m);
	}

}
