package com.exception;

//finally block always executed

public class FinallyBlock {

	public static void main(String[] args) {
	
		int a=10,b=0,c;
		try {
			
			c = a/b;
			
			
		} catch (Exception e) {
			
			System.out.println("catch block executed");
			
		}
		
		finally {
			
			System.out.println("finally block executed");
			
		}
		

	}

}
