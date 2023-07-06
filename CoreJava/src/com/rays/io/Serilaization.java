package com.rays.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Serilaization {
	
	public static void main(String[] args) throws Exception {
		
		FileInputStream file = new FileInputStream ("C:\\Users\\HP\\Desktop\\RAYS\\Serlaization.txt");
		ObjectInputStream in = new ObjectInputStream(file);
		
		Marksheet m = (Marksheet)in.readObject();
		
		System.out.println(m.name);
		System.out.println(m.physic);
		System.out.println(m.chemistry);
		System.out.println(m.maths);
		
		
		in.close();
		file.close();
		
	} 
	
		
	
	
		
	}

