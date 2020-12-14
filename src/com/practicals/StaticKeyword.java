package com.practicals;


class Employee
{
    static int empId;
	static String empName;
	//sapouse many employee have a same company so we can declare this. this type of coading menage our memory 
//	  menage our memory
	static String empCompany="infosys";
	
	public Employee(int empId,String empName) {
		this.empId = empId;
		this.empName = empName;
//		this.empCompany = empCompany;//this variable consume memory every time of object creation
	}
	
	void display()
	{
		System.out.println("Employee name is = "+empName+"\nEmployee id is = "+empId+""
				+ "\nEmployee company is = "+empCompany);	
	}			
}


public class StaticKeyword {

	public static void main(String[] args) {
		
//	we can use static variable without creation of object	
		
//	System.out.println("Employee name is = "+Employee.empCompany+"\nEmployee id is = "+Employee.empId+""
//			+ "\nEmployee company is = "+Employee.empCompany);	

		Employee e1 = new Employee(102, "shubham");
		e1.display();
	}

}
