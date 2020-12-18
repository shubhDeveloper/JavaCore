package com.oops.example;

//1) Final variable
//2) Final method
//3) Final class

//1) Final variable : If you make any variable as final ,you can not change the value of final variable
//   (It will be constant)

/*

class Vehical
{
    final int speedlimit = 130;
	void speed()
	{
		  //speedlimit = 120; ///compile time error
		  System.out.println(speedlimit);
	}
	void display()
	{
	     System.out.println("speed is = "+speedlimit);
	}
}

*/

//2) : Final method - If you make any method as a final ,you can't override it.

/*

class Bike
{
	final void start()
	{
		System.out.println("Bike start");
	}
}
class Splendor extends Bike
{
	void start()  ///compile time error bcz. we can't override it 
	{
		System.out.println("spledor start");
	}
}

*/

//3) Final class - you make any class as final we can't extends
/*
final class Bike
{
	
}
class Splendor extends Bike  // we cant extend bcz. parent class is final
{
	
}
*/

public class FinalKeyword {

	public static void main(String[] args) {

//1)  Final variable.......
		
//	  Vehical v = new Vehical();	
//	  v.speed();
//	  v.display();
		

	  

	}

}
