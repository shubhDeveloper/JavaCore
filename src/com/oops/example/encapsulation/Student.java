package com.oops.example.encapsulation;


public class Student {
	
	int id;
	String name;
	String company;
	float salary;
	
	public int getId()
	{
		return id;
	}
	public String getName()
	{
		return name;
	}
	public String getCompany()
	{
		return company;
	}
	public float getSalary()
	{
		return salary;
	}
	public void setId(int id)
	{
		this.id = id;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public void setCompany(String company)
	{
		this.company=company;
	}
	public void setSalary(float salary)
	{
		this.salary = salary;
	}
	
	public Student(int id,String name,String company,float salary)
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
		this.company=company;
	}
	
	public Student() {
		// TODO Auto-generated constructor stub
	}
	public void display()
	{
		System.out.println("id is = "+id+" name is = "+name+" company is = "+company+" salary is = "+salary);
	}
	

}
