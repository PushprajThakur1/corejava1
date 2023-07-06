package com.coll.comparator;

import java.util.Comparator;

public class Employee__Compartor {

	private Integer id;
	private String name;
	private Integer age;

	public Employee__Compartor() {
	}

	public Employee__Compartor(int id, String name, int age) {

		this.id = id;
		this.name = name;
		this.age = age;

	}

	public void setId(int id) {
		this.id = id;

	}

	public Integer getId() {
		return id;

	}

	public void setName(String name) {
		this.name = name;

	}

	public String getName() {
		return name;

	}

	public void setAge(int age) {
		this.age = age;

	}

	public Integer getAge() {
		return age;

	}

	@Override
	public String toString() {
		return this.id + " " + this.name + " " + this.age;

	}

	public int compare(Employee__Compartor o1, Employee__Compartor o2) {
		return 0;

	}

}

class orderById implements Comparator<Employee__Compartor> {
	public int compare(Employee__Compartor e1, Employee__Compartor e2) {
		return e1.getId().compareTo(e2.getId());
	}
}

class orderByName implements Comparator<Employee__Compartor>{
	public int compare(Employee__Compartor e1 , Employee__Compartor e2 ) {
		return e1.getName().compareTo(e2.getName());
	}
}

class orderByAge implements Comparator<Employee__Compartor>{
	public int compare(Employee__Compartor e1 , Employee__Compartor e2 ) {
		return e1.getAge().compareTo(e2.getAge());
	}
}
