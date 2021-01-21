package com.collection.set;

import java.util.SortedSet;
import java.util.TreeSet;

/*_____________________________________________________________________________________________________________________

SortedSet Interface : 

* It is a child interface of set.
* If we want to represent a group of individual objects where duplicates objects are not allowed.
* Insertion order is not preserved but all the elements are inserted some sorting order of elements.
  The sorting order may be default natural sorting order or customized sorting order.

SortedSet interface contains the following more specific methods :                 | [100,101,102,103,104,107,110,115]
                                                                                   
1) Object first()        => Return first element of the SortedSet.                 |      [100]
                                                                                   
2) Object last()         => Return last element of the SortedSet.                  |      [115]
                                                                                   
3) headSet(104)          => Return the SortedSet whose elements are < obj          |      [100,101,102,103]
                                                                                   
4) tailSet(104)          => Return the SortedSet whose elements are >= obj         |      [104,107,110,115]
                                                                                   
5) subSet(103,110)       => Return SotredSet whose elements are >= obj1 and obj2   |      [103,104,107]      
                                                                                   
6) Comparator comparator() => return comparator object that describes underlying   | 
                              sorting techniques if we are using default nature    |      [null] 
                              sorting order then we will get null                  |
                              
Important Note :=> * Default natural sorting order for numbers is ascending order and for string alphabetical order.
                   * we can apply the above methods only on SortedSet implementation class objects that is on the tree
                     object.




_____________________________________________________________________________________________________________________*/

public class SortedSet_Demo {

	public static void main(String[] args) {
		
		SortedSet<String> set = new TreeSet<>();
		set.add("mohan");
		set.add("sohan");
		set.add("rohan");
		set.add("vikas");
		set.add("shubham");
		set.add("neetu");
		set.add("vaishali");
		set.add("marry");
		
		System.out.println(set);                             // prent all elements some alphabetical order
		System.out.println(set.first());                     // return marry
		System.out.println(set.last());                      // return vikas
		System.out.println(set.headSet("shubham"));          // return [marry , mohan , neetu , rohan]
		System.out.println(set.tailSet("shubham"));          // return [shubham , sohan , vaishali , vikas]
		System.out.println(set.subSet("shubham", "vikas"));  // return [shubham , sohan ,vaishali]
        System.out.println(set.comparator());                // null
		
	}
}
