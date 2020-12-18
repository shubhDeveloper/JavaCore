package com.oops.example;

//1) : super is used to refer immediate parent class instant variable

/*
class Animals
{
	String colour="white";
}
class Dogs extends Animals
{
	String colour="black";
	void printColour()
	{
	     System.out.println(colour);//black
	     System.out.println(super.colour);//white : //super is used to refer immediate parent class instant variable
	}
}
*/

//2) : super is used to refer immediate parent class methods

/*

class Animals
{
	String colour = "black";
	void eat()
	{
		System.out.println("Dog is eating");
	}
}
class Dogs extends Animals
{
	void eat()
	{
		System.out.println(super.colour);
		System.out.println("Dog is not eatong");
	}
	void bark()
	{
		System.out.println("Dog is barking");
	}
     
	void display()
	{
		super.eat();//Dog is eating
	}
}

*/

public class JavaSuperKeyword {

	public static void main(String[] args) {
		
//		1) ................
		
//		Dogs dog = new Dogs();
//		dog.printColour();
		
//		2) ................
		
//		Dogs d = new Dogs();
//		d.eat();
//		d.bark();
//		d.display();
		
	}

}
