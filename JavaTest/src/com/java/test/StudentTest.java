package com.java.test;

//Immutable Class Example.
public class StudentTest {

	public static void main(String[] args) throws CloneNotSupportedException {

		Address stdAdd = new Address("Pilibhit", 262001);
		Student std = new Student(101, "Java", stdAdd);
		System.out.println(std.toString());
		std.getStdAdd().setCity("Noida");
		System.out.println(std.toString());
	}

}
