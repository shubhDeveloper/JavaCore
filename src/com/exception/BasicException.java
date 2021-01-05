package com.exception;

//Exception = An exception is an unwanted or unexpected event which occur during the excution
//of program i.e runtime that disturb the normal flow of program
//----Throwable class is the parent class of exception

//Diffrence between Exception and errors

//---------------Exception------------------
/*
1) In most of the cases exception occured by our program
2) Exceptions are recoverable
3) Exceptions are mainly 2 types 1)checked exception 2) unchecked Exception
//-----------------Errors-------------------
1) Most of the cases errors occurs because of lack of our system resorces not out program
2) Errors are not recoverable
*/



public class BasicException {

//	basic program of exception
	void exception() {
		try {

			System.out.println("exception is = " + (10 / 5));
			System.out.println("exception is = " + (10 / 2));
			System.out.println("exception is = " + (10 / 0));
		} catch (Exception e) {
			System.out.println("exception is = 0");
			System.out.println("exception is = " + (10 / 1));
		}

	}

	public static void main(String[] args) {
		BasicException exception = new BasicException();
		exception.exception();

	}

}
