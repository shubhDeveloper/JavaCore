package com.oops.example;

//INHERITANCE EXAMPLE
/*

class A
{
	A()
	{
		System.out.println("hello this is constructor of class A");
	}
}
class B extends A
{
    void go()
    {
    	System.out.println("this is go method of class b");
    }
}

*/

//___________________________________________________________________________________________

/*
    Types of inheritance------
    
    1) Single inheritance
    2) multilevel inheritance
    3) mutiple inheritance 
    4) hierarchical inheritance
    5) hybtid inheritance  
 */

// Single inheritance ------- when a class inherits another class is called single inheritance

//SINGLE INHERITANCE + METHOD OVERRIDING + MULTILEVEL INHERITANCE

/*

class Animal
{
	public Animal() {
		System.out.println("Animal class called");
	}
	void eat()//common method
	{
		System.out.println("Animal eat many foods");
	}
}
class Dog extends Animal
{
	public Dog() {
	     System.out.println("dog class called");	
	}
	void eat(String s)//parameterized method
	{
		System.out.println("Dog likes "+s);
	}
}
class Cat extends Dog
{
    public Cat() {
		System.out.println("cat class called");
	}
    void eat()//common method
    {
    	System.out.println("cat drink milk");
    }
}
*/
//_____________________________________________________________________________________

//HIERARCHICAL INHERITANCE

//when two or more classes inherits a single class called hierarchical inheritance
/*

class Animal
{
    public Animal() {
		System.out.println("animal class called");
	}	
    void eat()
    {
    	System.out.println("Animal eats many foods ");
    }    
}
class Bird extends Animal
{
	public Bird() {
		System.out.println("bird feeds beans");
	}
	void eat() 
	{
		System.out.println("bird eat beans");
	}
}
class Tiger extends Animal
{
	public Tiger() {
         System.out.println("tiger is a king of forest");
	}
	void eat()
	{
		System.out.println("tiger eats nothing ");
	}
}

*/

//_______________________________________________________________________________________



public class Inheritance_IsA_Rel //extends Cat //extends B
{	
	public static void main(String[] args) {
        
//		Simple Example of inheritance

//		Inheritance_IsA_Rel rels=new Inheritance_IsA_Rel();
//      rels.go();
		
//		SIMPLE AND MULTILEVEL
		
//		Inheritance_IsA_Rel rels = new Inheritance_IsA_Rel();
//		rels.eat(); //cat drink milk
//		rels.eat("mangoes");
		
//		HIERARCHICAL INHERITANCE
		
//	   Bird bird = new Bird();
//	   Tiger tiger = new Tiger();
//	   bird.eat();
//	   tiger.eat();
//		bird.eat();
	  
	}

}
