package com.polymorePhism;

//      If subclass(child class) has the same method as declared in the
//      present class known as method overriding in java

//  Rules for java method overriding

//1) The method must have same name as the parent class.
//2) The method must have the same parameter as in parent class.
//3) There must be an IS-A relationship (Inheritance)

class Addition
{
	void add(int a,int b)
	{
		System.out.println("addition is = "+(a+b));
	}
}
class Subtraction extends Addition
{
	void add(int a,int b)  //override method
	{
		System.out.println("subtraction is = "+(a-b));
	}
}



public class MethodOverRiding {
	
	public static void main(String[] args) {
		Subtraction sb = new Subtraction();
		sb.add(12,12);
        
	}

}
