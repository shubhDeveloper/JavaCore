package com.collection.list;
/*___________________________________________________________________________________________________________________

Stack :

* It is a child class of vector.
* It is specially designed class for last in first out order (LIFO).

Constructors of stack :

* Stack s = new Stack();

Methods of stack :

1) Object push(Object obj); => For inserting an object to the stack.

2) Object pop();            => To removes and returns top of the stack.

3) Object peek();           => To returns the top of the stack without removal of object.

4) int search(Object obj);  => If the specified object is available it returns its ofset from top of the stack
                               - If object is not available then it returns -1

___________________________________________________________________________________________________________________*/

import java.util.Iterator;
import java.util.Stack;

public class Stack_Demo {

	void addEx() {

		Stack stack = new Stack<String>();

		// push
		stack.push("rahul");
		stack.push("rohan");
		stack.push("vikas");
		stack.push("janie");
		stack.push("salah");
		stack.push("harry");

		// pop
		
		String string = (String) stack.pop();                  // it removes stack last index value. remove = harry
		System.out.println("pop => "+string+"\n");             // harry

		//peek
		
		String string2 = (String) stack.peek();
		System.out.println("peek => "+string2+"\n");           // salah
		
		//search
		
		int i = stack.search("janie");
		System.out.println("search => "+i+"\n");               // 2 bcz. its index of janie
		
		int j = stack.search("mohan");
		System.out.println("search => "+j+"\n");               // -1 bcz. mohan not available is stack     
		
		Iterator<String> itr = stack.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

	public static void main(String[] args) {

		Stack_Demo st = new Stack_Demo();
		st.addEx();

	}

}
