package com.exception;


public class BasicException {

	int a=10,b=0,c;
//	basic program of exception handeling
	void exception() {
		try {

			c = a/b;
			
		} catch (Exception e) {
			
			e.printStackTrace(); // print all about exception
			
		}

	}

	public static void main(String[] args) {
		BasicException exception = new BasicException();
		exception.exception();

	}

}
