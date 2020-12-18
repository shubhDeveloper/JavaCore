package com.polymorePhism;

//If a class has multiple methods having same name but -  
//different in parameters, it is known as Method Overloading.

//There are two ways to overload the method in java
//
//1) By changing number of arguments
//2) By changing the data type


public class MethodOverloading {
	
//	1) by changing number of argument
	
	/*
	
	void Employee(int id ,int salary)
	{
	    System.out.println("employee id = "+id+"\nemployee salary = "+salary);
	}
	void Employee(int id,int salary,int contect)
	{
		System.out.println("employee id = "+id+"\nemployee salary = "+salary+"\nemployee contect = "+contect);
	}
	
	*/
	
	
//	2) By changing the data type

	/*
	
	void student(int id,String name)  
	{
		System.out.println("student id = "+id+"\nStudent name = "+name);
	}
	void student(int stdClass,float marks)
	{
		System.out.println("student class = "+stdClass+"\nStudent marks = "+marks);
	}
	void student()
	{
	    System.out.println("this is simple method");	
	}
	
	*/
	public static void main(String[] args) {
		MethodOverloading m1 = new MethodOverloading();
//		m1.student(12, 123.6f);
//		m1.Employee(123, 12345, 22334455);
	}

}
