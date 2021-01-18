package com.collection.list;

import java.util.Iterator;
import java.util.Vector;

/*______________________________________________________________________________________________________________________

Vector :

* The underlying data structure for vector is resizable array or growable array.
* Duplicates value are allowed.
* Insertion order is preserved.
* Null insertion is possible.
* Hetrogeneous objects are allowed.
* Vector class implemented serializable , clonable and RendomAccess interfaces.
* Most of the method present in vector are synchronized hence vector object is thread safe.
* Best choice if the frequent operation is retrival.

For adding objects :

*  add(Object o)                :              from collection list 
*  add(int index , Object o)    :              from list
*  addElement(Object o)         :              Vector

For removing objects :

* remove(Object o)              :              from collection
* removeElement(Object o)       :              from vector
* remove(int index)             :              from list
* removeElementAt(int index)    :              from vector
* clear()                       :              collection
* removeAllElements()           :              from vector 

For Accessing Elements :

* Object get(int index)         :              from collection
* Object elementAt(int index)   :              from vector
* Object firstElement()         :              from vector
* Object lastElement()          :              from vector

Constructors of vector :

* creates an empty vector object with default initial capaciry 10 once vector reaches its max capacity a new vector 
  object will be created with new capacity = (2*current capacity) 
  
1)  Vector v = new Vector();
2)  Vector v = new Vector(int initialCapaciry);
3)  Vector v = new Vector(int initialCapacity , int incrementalCapacity);
____________________________________________________________________________________________________________________*/

public class Vector_Demo {

	void addVector() {

		Vector<String> vector = new Vector<String>();
		vector.addElement("shubham"); // vector add method
		vector.addElement("rahul");
		vector.addElement("vikas");

		System.out.println(vector); // return all elements in a array

	}

	void advanceVactor() {

		// we can set the initial capacity of vector
		Vector<Integer> vector2 = new Vector<Integer>(2); // here initial capacity is 2
		System.out.println(vector2.capacity());

		vector2.addElement(123);
		vector2.addElement(124);
		vector2.addElement(125);
		vector2.addElement(126);
		vector2.addElement(127);
		vector2.addElement(129);
		vector2.addElement(121);

		System.out.println(vector2.capacity());

		for (int i : vector2) {
			System.out.println(i); // return values one by one in sequence
		}

	}

	void get_remove() {

		Vector<String> vector3 = new Vector<String>(3, 1);   // we can set initial capacity or incremental capacity both

//      check capacity
		System.out.println(vector3.capacity());                      // 3 bcz we set initial capacity = 3

//      Add methods
		vector3.addElement("mohan");
		vector3.addElement("harry");
		vector3.add(1, "Rohan");
		vector3.addElement("smith");
		vector3.addElement("salah");

		System.out.println(vector3.capacity());                      // 5 bcz we set incremental capacity is = 1

//      Get Methods
		System.out.println(vector3.elementAt(3));                    // vector method
		System.out.println(vector3.firstElement());
		System.out.println(vector3.lastElement());
//      System.out.println(vector3.lastIndexOf(vector3));

//      RemoveMethods
		System.out.println("removed " + vector3.remove(2));
//      System.out.println("removed "+vector3.removeElement(1));
//      System.out.println(vector3.removeAll(vector3));              //remove all elements of vector3

	}

	public static void main(String[] args) {

		Vector_Demo demo = new Vector_Demo();

//		demo.addVector();
//		demo.advanceVactor();
		demo.get_remove();

	}

}
