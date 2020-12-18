package com.oops.example;


//Interface - An interface in java is a blueprint of a class .It has static constant and abstract methods.
//  The interface in java is a mechanism to achive abstraction.

//Simple Interface Example-----------

/*

interface College
{
	void student();
}
class Teacher implements College
{
	@Override
	public void student() {
		System.out.println("hello this is student method and this is also a interface method");
	}
}

*/
//______________________________________________________________________________
//Advance program Interface

/*

interface School
{
	default void method() //default method called
	{
		System.out.println("hellp this is default method");
	}
	void student();
}
class Teacher implements School
{
	@Override
	public void student() 
	{
		System.out.println("student method called");
	}	
}
class Hod implements School
{
	@Override
	public void student()
	{
         System.out.println("student override method called"); 		
	}
}

*/
//_________________________________________________________________________

// Multiple inheritance example using interface

/*
interface Airport
{
	void flight();
}
interface Railway
{
	void train();
}
class Run implements Airport,Railway
{
	@Override
	public void train()
	 {
		 System.out.println("train start");
	 }

	@Override
	public void flight() {
		System.out.println("flight takeoff");
	}
}
*/
//__________________________________________________________________________________
//interface extends interface example

/*
interface Theater
{
    void firstClass();
}
interface Mall extends Theater
{
	void bigBazaar();
}

class Implement implements Mall
{
	@Override
	public void firstClass() {
		System.out.println("hello this is first class");		
	}

	@Override
	public void bigBazaar() {
		System.out.println("hello this is big bazaar");		
	}
}
*/
//_____________________________________________________________________________________

// Static method in interface----------------

/*

interface StaticMethod
{
	static void staticMethod()   //static method
	{
		System.out.println("hello this is static method");
	}
    void normalMethod();         //normal method
}
interface DefaultMethod extends StaticMethod
{
	default void defaultMethod()   //default method
	{
		System.out.println("this is default method");
	}	
}
class MainClass implements DefaultMethod
{
	@Override
	public void normalMethod() {
	     System.out.println("this is normal mehtod");
	}
}

*/
//________________________________________________________________________________

public class InterfaceInJava {

	public static void main(String[] args) {
		
//		Simple interface example 1
		
//		Teacher teacher = new Teacher();
//		teacher.student();

//		interface example 2
		
//		Teacher teacher = new Teacher();
//		teacher.student(); //student method called
//		teacher.method();  //default method called 
		
//		interface example 3
		
//		School school = new Hod(); //Interface Reference variable
//		school.method(); // default method   
//		school.student(); //   Hod class method called

//		interface example 4 multiple inheritance
		
//		Run run = new Run();
//		run.flight();
//		run.train();
		
//		interface example 5 ----------------------
		
//		Implement implement = new Implement();
//		implement.bigBazaar();   //hello this is big bazaar
//		implement.firstClass();  //hello this is first class		
		
		//static method example with Interface
		
//		MainClass main = new MainClass();
//		main.defaultMethod();      ////default method called
//		main.normalMethod();       ////normal method called
//	    StaticMethod.staticMethod();   ////static method called(no need of object for calling static method)
		
	}

}
