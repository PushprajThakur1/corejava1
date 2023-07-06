package com.rays.basics;

public class lane2 {
	public static void main(String[] args) {

		String name = " pushpraj ";
		System.out.println("7th character is -" + name.charAt(6));
		System.out.println("Dina index is-" + name.indexOf("raj"));
		System.out.println("First p position-" + name.indexOf("p"));
		System.out.println("Last p position-" + name.lastIndexOf("p"));
		System.out.println("p is replaced by a-" + name.replace("p", "a"));
		System.out.println("chhota pushpraj -" + name.toLowerCase());
		System.out.println("bada pushpraj -" + name.toUpperCase());
		System.out.println("starts with pushp -" + name.startsWith(" pushp"));
		System.out.println("end with raj-" + name.endsWith("raj "));
		System.out.println("substring-" + name.substring(5));
	}
}
