package com.collection.set;

import java.util.HashSet;

/*____________________________________________________________________________________________________________________

HashSet :

 * The underlying data structure of HashSet is HashTable.
 * Insertion order is not preserved and all objects will be inserted based on hash-code of objects.
 * Duplicate objects are not allowed. If we are trying to insert duplicates we want get any compile time error or
   runtime error. add() method simply return 'false'.
 * Heterogeneous objects are allowed.
 * Null insertion is possible.
 * Implements serializable and clonable interface but not random access.
 * HashSet is the best choice if our frequent operation is search operation. 

Constructors of HashSet :

1) HashSet set = new HashSet();
   Creates an empty HashSet Object with default initial capacity 16 and default fill ratio 0.75.
   
2) HashSet set = new HashSet(int initialCapacity);
   Creates an empty HashSet Object with specified initial capacity and default fill ratio 0.75.
 
3) HashSet set = new HashSet(int initialCapacity , float loadFactor);
   Creates an empty HashSet object with specified initial capacity & specified load factor of fill ratio

4) HashSet set = new HashSet(Collection c);
____________________________________________________________________________________________________________________*/

public class HashSet_Demo {

	public static void main(String[] args) {
		
		HashSet<String> set = new HashSet<String>();
		set.add("rohan");
		set.add("vikas");
		set.add("mohan");
		set.add("harry");
		set.add(null);                        //Inserted successfully bcz. null insertion is possible
		set.add("salah");
		set.add("mohan");                     //This is not inserted bcz. duplicates are not allowed
        
		System.out.println(set.remove("harry"));   //remove harry from set
		System.out.println(set);
		
	}

}
