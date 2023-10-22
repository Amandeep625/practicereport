package com.mits;

public class EmployeeData {
	int age;
	String name;
	public EmployeeData(int age, String name) {
		this.age=age;
		this.name=name;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeData obj1=new EmployeeData(30,"BoB");
		EmployeeData obj2=new EmployeeData(40,"Matt");
		System.out.println(obj1.age);
		System.out.println(obj2.name);
		
		

	}

}
