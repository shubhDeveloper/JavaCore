package com.practicals;
// Super keyword real world example

class Vehical
{
    int id;
    String colour;
  
    public Vehical(int id,String colour) {
    	this.id = id;
    	this.colour = colour;
	}
}
class Motercycle extends Vehical
{
	String company;
	
	public Motercycle(int id, String colour,String company) {
		super(id, colour);  //Vehical constructor
		this.company = company;
	}

	void display()
	{
		System.out.println("id is = "+id+"\ncolour is = "+colour+"\ncompany is = "+company);
	}
}
public class SuperKeyword {

	public static void main(String[] args) {
		Motercycle cycle = new Motercycle(121, "blue", "maruti");
		cycle.display();

	}

}
