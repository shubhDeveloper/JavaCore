package com.collection.list;

import java.util.ArrayList;
import java.util.Iterator;

/*________________________________________________________________________________________________________________________

ArrayList : 

* The Underlying data structure resizable array or growable array.
* Duplicates are allowed
* Null insertion is possible
* Best for retrive data because it is implement RandomAccess interface
  (RandomAccess interface present in java.util package) 
* creates an ArrayList object with default initial capacity 10 once ArrayList reaches its capacity increaces
  New Capacity = (current capacity * 3/2) + 1 

________________________________________________________________________________________________________________________*/

public class ArrayList_Demo {

	void multipleDataType()
	{
		//Insert any type of data
	    ArrayList list = new ArrayList();
		list.add("shubham");
		list.add("rahul");
		list.add(123);
		list.add(true);
		list.add(123.001);
		list.add(null);		
		//Use Iterator = iterator interface provides the fecility of iterating elements in forward direction
				
		Iterator itrIterator = list.iterator();
		while(itrIterator.hasNext()) {
		    System.out.println(itrIterator.next());
		}
		        	
	}
	
	void singleDataType()
	{
		
		//insert only one type of data
		ArrayList<String> list = new ArrayList<String>();
		list.add("rahul");
		list.add("ram");
		list.add("rohit");
		list.add("vadika");
		list.add("manisha");
		list.add("neetu");
		list.add(null);
		
		System.out.println(list);
		
//		Iterate Using for each loop
		for(String string : list) {
			
			System.out.println(string);
		}
		
	}
	
	void objectDataType()
	{
		
		//Create object of StudentObj
		StudentObj stdObj = new StudentObj(123, "shubham", "panchal", "12th", "shujalpur");
		StudentObj stdObj2 = new StudentObj(12345, "Ram", "Nema", "11th", "indore");
		
		//Crate Array List
		ArrayList<StudentObj> stdList = new ArrayList<StudentObj>();
		
		//Add Objects in ArrayList
		stdList.add(stdObj);
		stdList.add(stdObj2);
		
		//Iterate Object Elements
		Iterator<StudentObj> ob = stdList.iterator();
		while(ob.hasNext()) {
			System.out.println(ob.next());
		}
		
	}
	
	public static void main(String[] args) {
		
		ArrayList_Demo arr = new ArrayList_Demo();
//        arr.singleDataType();
//		  arr.multipleDataType();
		  arr.objectDataType();
		
	}

}
