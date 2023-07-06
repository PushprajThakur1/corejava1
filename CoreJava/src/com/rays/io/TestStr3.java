package com.rays.io;

import java.util.ArrayList;
import java.util.List;

public class TestStr3 {

	
	public static void main(String[] args) {
		
		List<String> items = new ArrayList<String>();
		
		items.add("one");
		items.add("two");
		items.add("three");
		items.add("four");
		items.add("five");
		
		items.stream().filter(e ->
		e.startsWith("t")).distinct().map(e ->
		e.toUpperCase()).sorted().forEach(e -> {
		  System.out.println(e);
            });
	}
	}

