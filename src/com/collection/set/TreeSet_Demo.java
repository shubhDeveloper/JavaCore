package com.collection.set;

import java.util.Comparator;
import java.util.TreeSet;

/*___________________________________________________________________________________________________________________
 
TreeSet : 

* The underlying data structure for treeSet is the balanced tree.
* Duplicates objects are not allowed.
* Insertion order not preserved but all objects will be inserted according to some sorting order.
* Heterogeneous objects are not allowed. if weare trying to inserted then we will get runtime exception saying 
  classCastException.
* Null insertion is allowed but only once.

TreeSet Constructor :

1) TreeSet t = new TreeSet();
   Create an empty TreeSet object where elements will be inserted according to some default natural sorting order
 
2) TreeSet t = new TreeSet(comparator()); 
   Creates an empty TreeSet object where elements will be inserted according to customized sorting order.

3) TreeSet t = new TreeSet(SortedSet s);

4) TreeSet t = new TreeSet(Collection c);
 
 
___________________________________________________________________________________________________________________*/

public class TreeSet_Demo {

	public static void main(String[] args) {
		
//		Create Object of pizza class
		/*
		Pizza pizza = new Pizza();
		pizza.setPizzaPrice(123);
		pizza.setPizzaBrand("kfc");
		
		
		TreeSet<Pizza> t = new TreeSet<Pizza>();
		t.add(pizza); //throw classCastException bcz heterogeneous objects are nota allowed 
		
		System.out.println(t);

        */
		
		TreeSet<String> treeSet = new TreeSet<String>();
	    treeSet.add(null);
		treeSet.add("rahul");
		treeSet.add("vikas");
		treeSet.add("harry");
		treeSet.add("salah");
//		treeSet.add("rahul");   //not inserted bcz null insertion is not possible
		
		
		System.out.println(treeSet);
	
	}

}
