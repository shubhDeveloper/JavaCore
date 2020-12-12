package com.oops.example;


public class ConstructorEx {
	
	
	
/*	DEFAULT CONSTRUCTOR-----------the default constractor is used to provid the default values to the object like 0
	                              ,null, etc. depending on the type*/
	
	
/*	
    int a1,b1;
	String c1;
      
    ConstructorEx() {
		System.out.println("this is default constructor ");
		System.out.println("  "+a1+" "+b1);
	}
	
	void display()
	{
		System.out.println("the salary of "+c1+" is "+b1+" and there id is "+a1);
	}
	
*/
	
	
/*	PARAMETARIZED CONSTRUCTOR------------The parameterized constructor is used to provide diffrent values to distnict
	                                     objects. However you CancelablePrintJob provide the same values also*/

/*
	
	int a1,b1;
	String c1;
	
	ConstructorEx(int id,String name,int salary) {
	     a1=id;
	     b1=salary;
	     c1=name;
     }
		
	void display()
	{
		System.out.println("the salary of "+c1+" is "+b1+" and there id is "+a1);
	}

*/
	
//	CONSTRUCTOR OVERLOADING----------Two constructor same name but diffrent parameter called constructor overloading 
	
/*  int a,b,c;
	String nameString;
	
    ConstructorEx(int id,int salary) {
		a=id;
		b=salary;
	}
    
    ConstructorEx(int id,int salary,String name)
    {
    	a=id;
    	b=salary;
    	nameString=name;
    }
    
    void display()
    {
    	System.out.println("nameString is = "+nameString+" id is = "+a+" salary is = "+b);
    }    
    
*/
	
//	COPY CONSTRUCTOR---------No copy constructor in java but we can copy the value of one constructot to another
	

/*	
	int a,b;
	String nameString;
	
	ConstructorEx(int i , String name) {
	     	a=i;
	     	nameString=name;
	}
	
	public ConstructorEx(ConstructorEx s) {
		a=s.a;
		nameString=s.nameString;
		}
	void display()
	{
		System.out.println("a is = "+a+" name is = "+nameString+" ");
	}
*/
	
//	COPY VALUES ANOTHER WAY
	
	int a,b;
	String name;
	
	public ConstructorEx(int id , String nameString) {
		a = id;
		name = nameString;
	}
	
	ConstructorEx()
	{
		 
	}
	
	void display()
	{
		System.out.println("print a is = "+a+" print name is = "+name);
	}
	
	
	
	public static void main(String[] args) {

		
//		 Default constructor
//	     ConstructorEx con = new ConstructorEx();
//	     con.display(12, 12);
         
	//		Parametarised constructor
	//		ConstructorEx con = new ConstructorEx(123,"shubham",40000);
	//		con.display();
		

//		 CONSTRUCTOR OVERLOADING
//	 	ConstructorEx con = new ConstructorEx(123, 40000),con1= new ConstructorEx(123, 40000,"shubham panchal");
//     	con.display();
//     	con1.display();
		
//		COPY CONSTRUCTOR
//		ConstructorEx ex = new ConstructorEx(123,"shubham"),ex1=new ConstructorEx(ex);
//		ex1.display();
		
		ConstructorEx ex = new ConstructorEx(123, "shubham panchal"),ex1 = new ConstructorEx();
		ex1.a=ex.a;
		ex1.name=ex.name;
		ex1.display();
	}

}
