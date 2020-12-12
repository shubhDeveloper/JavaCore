package com.examples;

import java.util.Scanner;

class Programs
{
	int a=0,b,res=0,no;
	Scanner scanner = new Scanner(System.in);
	void factorials()
	{
		System.out.println("This is factorials program\nenter no");
		a=scanner.nextInt();
		no=a;
		for(int i=a-1;i>0;i--)
		{
			a=a*i;
		}
		System.out.println("no is = "+a);
	}
	void zigma()
	{
		System.out.println("this program find zigma \n enter number");
		a=scanner.nextInt();
		no=a;
		for (int i = a-1; i > 0; i--) {
			a=a+i;
		}
		System.out.println("zigma of "+no+" is = "+a);
		
	}
}

public class Examples extends Programs{

	public static void main(String[] args) {
		Examples examples = new Examples();
//		examples.factorials();
		examples.zigma();

	}

}
