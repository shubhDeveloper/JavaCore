package com.collection.list;

import java.util.ArrayList;
import java.util.Iterator;

/*________________________________________________________________________________________________________________________

ArrayList : 

* The Underlined data structure resizable array or growable array.
* Duplicates are allowed
* Null insertion is possible
* Best for retrive data because it is implement RandomAccess interface
  (RandomAccess interface present in java.util package) 
* creates an ArrayList object with default initial capacity 10 once ArrayList reaches its capacity increaces
  New Capacity = (current capacity * 3/2) + 1 

________________________________________________________________________________________________________________________*/

public class ArrayList_Demo {

	void method1()
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
	
	void method2()
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
		
//		Iterate Using for each loop
		for(String string : list) {
			
			System.out.println(string);
		}
		
	}
	
	public static void main(String[] args) {
		
		ArrayList_Demo arr = new ArrayList_Demo();
//		arr.method1();
		arr.method2();
	}

}
