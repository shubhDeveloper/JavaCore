package com.practicals;

import java.util.Scanner;

public class PolindromNumber {

	public static void main(String[] args) {
//		Polindrom number example
		int num,rem,rev=0;
		System.out.println("enter number");
		Scanner s1=new Scanner(System.in);
		num = s1.nextInt();
	    int val = num;
		
		while(num>0)
		{
			rem = num%10;
			rev = rev * 10 +rem;
			num = num/10;
		}
		System.out.println("number is = "+num);
		if(val==rev)
		{
			System.out.println("number is polindrom");
		}
		else {
			System.out.println("not polindrom");
		}
//		System.out.println("numbrer is = "+rev);
	}

}
