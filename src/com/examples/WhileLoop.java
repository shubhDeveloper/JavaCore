package com.examples;

import java.util.Scanner;



public class WhileLoop {

	Scanner scanner = new Scanner(System.in);
//WHILE LOOP

	int a,b,i=1;
	static String string  = "goverment college";
	public void while1()
	{
		{
			while (i<=10) {
		    	System.out.println(+i+"hello world \n ");
				i++;
			}
		}

	}
	
//PRIME NUMBER	

	void primeNum()
	{
		int p=2,h=0;
		System.out.println("enter no");
		a=scanner.nextInt();
		while(p<a) {
//			System.out.println("this is not a prime no");
			if(a%p==0)
			{
				System.out.println("1st if block executed");
				h++;
				break;
			}
			System.out.println(+p+"exit if block");
			p++;
		}
		if(h>0)
		{
			System.out.println("this is not a prime no");
		}
		else {
			System.out.println("this is a prime no");
		}
	}
	
//	CONTINUE STATEMENT
	
	void continues()
	{
		 int i=0;
	     System.out.println("this function use continue statement/nenter no");
	     a=scanner.nextInt();
	     while(i<a)
	     {
	    	 
	    	 System.out.println("print "+i);
	    	 if(i==5)
	    	 {
	    		 System.out.println("this is continue statement");
	    		 i++;
	    		 continue;
	    	 }
	    	 System.out.println("i++ executed");
	    	 i++;
	     }
	     System.out.println("work of continue");
	}
	
	
	public static void main(String[] args) {
		
		WhileLoop whileLoop=new WhileLoop();
//	    whileLoop.while1();
//		whileLoop.primeNum();

		whileLoop.continues();
		
	}

}
