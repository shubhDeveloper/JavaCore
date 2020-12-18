package com.oops.example;

import com.examples.Examples;

//Abstraction = Abstraction is a process of hiding the implementation
//details and showing the functionality to the user

// 2 Ways to achive Abstraction-
// 1) Abstract Class (0 to 100%)
// 2) Interface (100%)

// 1) Abstract class = A class which is declared as abstract is known as abstract class 
// It can have abstract and non-abstract methods,

// 2) Abstract method = A method which is declared as abstract and does not have 
// implementation is known as an abstract method
//______________________________________________________________________________________

// ====Example of abstract class that has an abstract method====
/*
abstract class Bike
{
	abstract void run(); //abstract method
}
class Splendor extends Bike
{
	void run() //Implementation of abstract method
	{
		System.out.println("bike is running");
	}
}
*/

//Abstract class having constructors and methods 

/*

abstract class Company
{
	abstract int noOfDeveloper(int dev);      // Abstract method must be in abstract class
	
	public Company()                          // Constructor
	{       
	    String name = "infosys";
	    System.out.println("company name is "+name);
	}
 	
	int noOfHr(int hr)                        // Regualr method
	{   
		return hr;
	}
}
class Employee extends Company
{
	@Override
	int noOfDeveloper(int dev)                //Implementation of abstract method 
	{	
		return dev;
	}   
}

*/

//another abstraction example

/*

abstract class Airport                    ////abstract class support static,non-static,abstract and final methods
{
	abstract void indego();  //abstract method
	void airIndia()          // normal method  
	{
		System.out.println("air india simple method called");
	}
	static void staticMethod()
	{
		System.out.println("static method called");
	}
	final void finalMethod()    //we can't override this method 
	{
		System.out.println("hello this is final method");
	}
}
class City extends Airport
{
	@Override
	void indego() {
		System.out.println("indego class called and this is an abstract method");
		
	}
	
}

*/

public class AbstractInJava {

	public static void main(String[] args) {

//		Examples 1---------------------
		
//		Splendor splendor = new Splendor();
//		splendor.run();
		
//		Employee e1 = new Employee();
//		System.out.println("no of hr = "+e1.noOfHr(123));
//		System.out.println("no of Developer = "+e1.noOfDeveloper(12345));
	
//		Examples 2---------------------
		
//		Airport.staticMethod();  ///static method called
//		City city = new City();  ///object of child class
//		city.airIndia();         ///normal method called
//		city.finalMethod();      ///final method called
//		city.indego();           ///abstract method called
		
		
	}
}
