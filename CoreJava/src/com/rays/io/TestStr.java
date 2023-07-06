package com.rays.io;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class TestStr {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		
		list.add("one");
		list.add("two");
		list.add("three");
		list.add("four");
		list.add("five");
		
		Stream<String>stream = list.stream();
		stream.forEach(e -> {
		
			System.out.println(e + " ");
	
		});

}
}
   