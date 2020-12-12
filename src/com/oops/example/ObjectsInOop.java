package com.oops.example;
//   There are three ways to initalize the object
//   1. By reference variable
//   2. By method
//   3. By Constructor

//__________________________________________________

// 1..................

class Obj
{
	int id;
	String name;
	String company;
	int Salary;
	
	void insertRecord(int a,String b)
	{
	      id=a;
	      name=b;
	}
	void employee(int a,String b,String c,int s)
	{
		id=a;
		name=b;
		company=c;
		Salary=s;
		System.out.println(+id+" "+name+"  "+company+"  "+Salary);
	}
	void display()
	{
		System.out.println(+id+" "+name+"  "+company+"  "+Salary);
	}
    
}



public class ObjectsInOop {
	
	public static void main(String[] args) {
		//Obj obj = new Obj();
//		obj.id=101;
//		obj.name="shubham";
		
//		obj.insertRecord(12, "shubham");
		
//		ANONYMOUS OBJECT_________
//		new Obj().employee(123,"shubham panchal","wipro",40000);
		
//		CREATE 2 OBJECT IN ONE ROW______________
		Obj obj = new Obj(),obj2=new Obj();
		
		obj.employee(123,"shubham panchal","innoeye",24000);
		obj.display();
		
		obj2.employee(12345, "vikas panchal", "wipro", 40000);
		obj2.display();
//		System.out.println(+obj.id+" "+obj.name);

	}

}
