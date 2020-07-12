package com.java.test;

//Immutable Class having Reference type variable Address
public final class Student{

	private int stdId;
	private String stdName;
	private Address stdAdd;
	
	public Student(int stdId,String stdName, Address address) {
		this.stdId = stdId;
		this.stdName= stdName;
		this.stdAdd = address;
	}

	public int getStdId() {
		return stdId;
	}

	public String getStdName() {
		return stdName;
	}
	
	public Address getStdAdd(){
		Address address= null;
		try {
			 address =(Address)stdAdd.clone();
		}catch (Exception e) {
			System.out.println("Exception in getStdAdd"+e.toString());
		}
		return address;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Student Name "+this.getStdName()+" \nStudent Id "+this.getStdId()+" \nStudent Address "+this.getStdAdd().toString();
	}
}
