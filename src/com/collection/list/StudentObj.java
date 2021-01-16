package com.collection.list;

public class StudentObj {

	int id;
	String fName;
	String lName;
	String standerd;
	String city;
	
	public StudentObj(int id, String fName, String lName, String standerd, String city) {
		super();
		this.id = id;
		this.fName = fName;
		this.lName = lName;
		this.standerd = standerd;
		this.city = city;
	}

	@Override
	public String toString() {
		return "StudentObj [id=" + id + ", fName=" + fName + ", lName=" + lName + ", standerd=" + standerd + ", city="
				+ city + "]";
	}
	
	
	
	
	
	
}
