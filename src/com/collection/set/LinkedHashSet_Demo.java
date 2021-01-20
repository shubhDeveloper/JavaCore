package com.collection.set;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;


/*___________________________________________________________________________________________________________________

LinkedHashSet : 

* It is the child class of HashSet.
* introduced in Java 1.4 version.
* It is exactly same as HashSet except the following diffrence.
 
  _______________________________________________________________________________
  
 |               HashSet                 |           LinkedHashSet               |
 |                                                                               |
 |  1) The underlyning data structutre   |   The underlying data structure is    |
 |     is hash table.                    |   hash table and LinkedList.          |
 |                                       |                                       |
 |  2) Insertion order is not preserved  |   Insertion order is preserved        |
 |                                       |                                       |
 |  3) Introduced in java 1.2 version    |   Introduced in java 1.4 version      |
 |                                       |                                       |
 |                                       |                                       |   
____________________________________________________________________________________________________________________*/



public class LinkedHashSet_Demo {

	public static void main(String[] args) {
		
		LinkedHashSet set = new LinkedHashSet();
		
	    set.add(123);
	    set.add("ramu");
	    set.add("vikas");
	    set.add(321);
	    set.add(null);
	    set.add("rohan");
	    set.add("vikas");
	    
	    Iterator itr = set.iterator();
	    while(itr.hasNext()) {
	    	Object next = itr.next();
	    	System.out.println(next.hashCode()+"  "+next);
	    }

	}

}
