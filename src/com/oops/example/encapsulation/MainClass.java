package com.oops.example.encapsulation;

public class MainClass {

	public static void main(String[] args) {
		
//	    through constructor
//		Student s = new Student(123, "shubham", "infosys", 50000);
//		s.display();
		
		Student s = new Student();
		s.setId(123);
		s.setName("shubham");
		s.setCompany("infosys");
		s.setSalary(50000);
		System.out.println("this is setter and getter method");
		System.out.println("id is = "+s.getId()+" name = "+s.getName()+" comapny is = "+s.getCompany()+" salary is = "+s.getSalary());

	}

}
