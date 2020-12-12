package com.examples;

import java.util.Scanner;

public class JavaProgram {

	
	int a,b,c;
	Scanner scanner = new Scanner(System.in);
//	FIBONACCIE SERIES
	
	void fibonacciSeries(int a)
	{
		
	    System.out.println("print of a = "+a);
	    int k=1,j=0;
	    for(int i=1;i<a;i++)
	    {
	         j = k+j;
	         k=j-k;    
	         System.out.print(j+" ");
	    }
	}
	
//	POLINDROM NUMBER
	
	void polindromNumber(int a)
	{
		int rem=0,sum=0,temp=a;
		System.out.println("enter number");
		for(int i=0;i<a;i++)
		{
			rem=a%10;
			sum=(sum*10)+rem;
			a=a/10;
		}
		if(sum==temp)
		{
			System.out.println("num is polindrom");
		}
		else {
			System.out.println("no is not a polindrom");
		}
	}
	
	
	public static void main(String[] args) {
		
		JavaProgram program = new JavaProgram();
		Scanner sc = new Scanner(System.in);
		System.out.println("wellcome");
		System.out.println("enter no");
		int a = sc.nextInt();
//		program.fibonacciSeries(a);
		program.polindromNumber(a);

	}

}
