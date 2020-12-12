package com.examples;

//import java.io.BufferedReader;

import java.io.InputStreamReader;
import java.util.Scanner;


class A
{
	Scanner scanner = new Scanner(System.in);
	int a,b,c,res;
	int go()
	{
		int res = a+b;
		System.out.print("hello this is class a sum is = ");
		return res;
	} 
	
	void swaping() throws NumberFormatException
	{
		//BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("enter 1st no");
		//a = Integer.parseInt(bReader.readLine());
		a=scanner.nextInt(); 
		System.out.println("enter 2nd no");
		b=scanner.nextInt();
		System.out.println("you entered a = "+a+" and b = "+b);
		
//		USING 3RD VARIABLE
		
//		c=a;
//		a=b;
//		b=c;
		
//		WHITHOUT USING 3RD VARIABLE
		
//		a=a+b;
//		b=a-b;
//		a=a-b;
		
//      USING SINGLE LINE
		
//		a=a+b-(b=a);
//		System.out.println("after swaping a = "+a+" and b = "+b);
	}
    
}

class B extends A
{
	//int a,b,res;
	void typeOfNumber()
	{
		System.out.println("this function check you entered even of odd number \n enter number");
		a=scanner.nextInt();
		if(a%2==0)
		{
	        System.out.println("this is even number");
		}
		else {
		    System.out.println("this is odd number");	
		}
		
	}
}

public class Inheritance extends B {

	public static void main(String[] args) throws NumberFormatException {
		//System.out.println("This is a example of inheritance");
		Inheritance inheritance = new Inheritance();
		//System.out.println(inheritance.go());
		//inheritance.swaping();
		inheritance.typeOfNumber();

	}

}
