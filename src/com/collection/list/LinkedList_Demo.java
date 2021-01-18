package com.collection.list;

import java.util.Iterator;
import java.util.LinkedList;


/*_______________________________________________________________________________________________________________________

LinkedList : 
* The underlying data structure is double LinkedList.
* Insertion order is preserved.
* Duplicates are allowed.
* Heterogeneous objects ara allowed.
* Null insertion is preserved.
* LinkedList implements serializable and clonable interface but not RandomAccess.
* LinkedList is the best choice if our frequent operation is insertion or deletion in the middle.
* LinkedList is the worse choice if our frequent operation is retrival operation
 
_______________________________________________________________________________________________________________________ */



public class LinkedList_Demo {

	void addAndget() {
		
		LinkedList<String> list = new LinkedList<String>();
		list.add("shubham");
		list.add("rahul");
		list.add("ramu");
		list.add("gaurav");
		 
//		list.removeFirst();                        // remove first index value
//		list.remove(1);                            // remove index element
//		list.addFirst("mohan");                    // add elements in index 0
//		list.addLast("vikas");                     // add elements in last index  
		
		System.out.println(list);
//		System.out.println(list.getLast());        // Get last element of list
//		System.out.println(list.getFirst());       // Get First element of list
//		System.out.println(list.getClass());       // Return class name
	

	}
	
	void addObject() {
		
		//Crate LinkedList obj
		LinkedList<StudentObj> list = new LinkedList<StudentObj>();
		
//		objects 0,1,2,3,4
		StudentObj stdObj = new StudentObj(120, "rahul", "parmar", "11th", "indore");
		StudentObj stdObj1 = new StudentObj(121, "shyam", "sharma", "12th", "jabalpur");
		StudentObj stdObj2 = new StudentObj(122, "harry", "gupta", "10th", "bhopal");
		StudentObj stdObj3 = new StudentObj(123, "raja", "dubey", "9th", "bombay");
		StudentObj stdObj4 = new StudentObj(124, "sohan", "solanki", "11th", "pune");
		
//		add object in the list
		list.add(stdObj);
        list.add(stdObj1);
        list.add(stdObj2);
        list.add(2, stdObj4);      //best for insertion  
		list.add(stdObj3);
        list.remove(0);            //best for removing elements in the middle of list
        
//      make copy of list : we can crate copy of list useing clone() method
		
//      LinkedList linkedList = (LinkedList) list.clone();
//      System.out.println(linkedList.getFirst());            //give first clone index value 
        
//      list.clear();                                         // clear list
        
	 	System.out.println(list.getFirst());                  //return first index object value
	 	System.out.println(list.getLast());                   //return last index object value
	
	 	
	 	//Get all elements of the list
	 	Iterator<StudentObj> itr = list.iterator();
	 
	 	while(itr.hasNext()) {
	 		
	 		System.out.println(itr.next());
	 	}
	}
	
	
	public static void main(String[] args) {
		
		LinkedList_Demo li = new LinkedList_Demo();
//		li.addObject();
		li.addAndget();		
	}

}
