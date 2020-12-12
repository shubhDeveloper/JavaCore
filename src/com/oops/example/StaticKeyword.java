package com.oops.example;

class StaticKeyword {

//	STATIC KEYWORD ----- If you declared any variable as a static called static variable;;
/*	
	int id,salary;
	String college = "IIM";     //Common property of both the object 
	
    public StaticKeyword(int i,int salar) {
		id=i;
		salary=salar;
	}	
    void display()
    {
    	System.out.println("id is = "+id+" college name is = "+college+" salary is = "+salary);   	
    }
  
*/ 
//	____________________________________________________________________________________________
	
//	WHITHOUT STATIC COUNT EXAMPLE
	
/*	int count=0;
	
	public StaticKeyword() {
		count++;
		System.out.println(count);
	}
*/	
	
//	_____________________________________________________________________________________________
    
//    WITH STATIC COUNT EXAMPLE	
	
//	static variable will get memory only once
	
/*	static int count=0;
	
	StaticKeyword()
	{
		count++;
		System.out.println(count);
		//count=13;
	}
*/
//________________________________________________________________________________________________

/*	static int count=0;
	public StaticKeyword() {
		count++;
		System.out.println(count); //2
	}
	
	static void count1()
	{   
		count++;
		System.out.println(count);  // 1
	}
*/

//_______________________________________________________________________________________

//	Static block
	
//	static
//	{
//		System.out.println("My name is shubham");
//	}
	
	
	
	
	
	
	
//_____________________________________________________________________________________________________________________	
	
public static void main(String[] args) {
		
//		basic static variable
		
//		StaticKeyword k1 = new StaticKeyword(123,40000),k2=new StaticKeyword(1234, 40000);
//		k1.display();
//		k2.display();
		
//_________________________________________________________________________	
		
//		Without static keyword
		
		//StaticKeyword keyword = new StaticKeyword(),keyword2 = new StaticKeyword(),keyword3 = new StaticKeyword(); 
        //  output ---- 1,1,1

//_________________________________________________________________________

//		With static keyword
	    
//	    StaticKeyword st = new StaticKeyword(),st1 = new StaticKeyword(),st3=new StaticKeyword();
        //  output ---- 1,2,3
		
//___________________________________________________________________________

//     Static method ----- if you apply static in any method called static method
	
//	   StaticKeyword.count1();   /// we can call Static method without object
//     StaticKeyword st	= new StaticKeyword();
       
//___________________________________________________________________________
	
//	   Static block ------ It is executed before the main method at the time of classloading
	
	  System.out.println("this is main method");
	
}
 
  
}
