package com.oops.example;


public class ThisKeyword { 
	
//	THIS KEYWOERD ------ this keyword can be used to refer current class instant variable with same name varible
	
/*
	int rollno;
	float fees;
	String name;
	
	public ThisKeyword(int rollno,String name,float fees) {
		this.rollno=rollno;
		this.name = name;
		this.fees = fees;
		
	}
	void display()
	{
		System.out.println("rollno = "+rollno+" name = "+name+" fees = "+fees);
		rollno++;
		fees++;
		name="shubha";
	}
	
*/
	
//	_______________________________________________________________________________________

	
/*	This to invoke current class method------you may invoke the method of the current class by using the this keyword 
	If you dont use this keyword , compiler automatically add this keyword while invoking the method.Let's see */
/*    
	void m()
	{
		System.out.println("hello i'm m");
	}
	void n()
	{
		System.out.println("hello i'm n");
		this.m();   //if you dont apply this compiler automatically apply this keyword
	}
*/
	
//_______________________________________________________________________________________
	
//	This to invoke currrent class constructor
	
/* this constructor call used to invoke the current class constructor*/
	
/*
	public ThisKeyword() {
		System.out.println("hello this is default constructor");
	}
	ThisKeyword(int a)
	{
		this(); ///non parametarized constructor called,,,This must be first statement in constructor
		System.out.println("hello this is parametarized constructor");
//		this();///// this is wrong 
	}
*/
	
	
//_________________________________________________________________________________________	
	
	public static void main(String[] args) {
		
//		ThisKeyword th = new ThisKeyword(123, "shubham panchal",112.5f);
//		th.display();
//      th.display();
		
//		ThisKeyword thisKeyword = new ThisKeyword();
//		thisKeyword.n();
        
//		ThisKeyword th = new ThisKeyword(12);
	}

}
