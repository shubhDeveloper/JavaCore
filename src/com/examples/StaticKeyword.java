package com.examples;

import com.sun.jdi.VoidType;

class Test 
{
	static int a;
	static String nameString;	
	
	public Test(int a,String nameString) {
		this.a=a;
		this.nameString=nameString;	
	}
    void display()
    {
    	System.out.println("Integer is = "+a+" String is = "+nameString);
    }
}

public class StaticKeyword {

	public static void main(String[] args) {
//		we can access static variable without create a object of class see here
//		System.out.println("integer is = "+Test.a+"\nString is = "+Test.nameString);
		Test t= new Test(10,"shubham");
		Test t2= new Test(100,"rahul panchal");
		t.display();
		t2.display();

	}

}
