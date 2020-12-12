package com.examples;

import java.util.Scanner;

public class Demo1 {
	int no;
	Scanner s = new Scanner(System.in);
	void table()
		{
			System.out.println("which table you want to print");
			    no = s.nextInt();
				for(int i=1;i<=10;i++)
				{
					int table = no*i;
					System.out.println(no+" X "+i+" = "+table);
				}
		    System.out.println("this is "+no+" table");
	    }
	void numbers()
	{
			System.out.println("which numbers do you want to print");
			no=s.nextInt();
			for(int i=no;i<10+no;i++)
			{
				System.out.println(i);
			}
	}
	
	void multiplication()
	{
		System.out.println("this is multiplay method");
		System.out.println("enter 1nd no");
		int a = s.nextInt();
		System.out.println("enter 2nd no");
		int b = s.nextInt();
		int mul = a*b;
		System.out.println("multiolication is = "+mul);
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Demo1 demo1 = new Demo1();
		System.out.println("hello this is main method");
		System.out.println("enter 1 for table\nenter 2 for numbers");
		int choice = s.nextInt();
		switch (choice) {
		case 1:
			demo1.table();
			break;
		case 2:
	        demo1.numbers();
	        break;
	    case 3:
	        demo1.multiplication();
	        break;
		default:
			System.out.println("pleace enter no");
			break;
		}	
	}
}
