package com.examples;

import java.util.Iterator;
import java.util.Scanner;



public class ArrayExample {
	
	Scanner scanner = new Scanner(System.in);
	
	void printArray()
	{
		
//		Declaration of array
//		int a[] = {1,22,33,44,55};
		
//		Using for each loop
//	    for(int h: a)	
//	    {
//		    System.out.println("print h = "+h);	
//		}
		
		
//		Using for loop
//		for (int i = 0; i < a.length; i++) 
//		{
//			System.out.println("array is = "+a[i]+"\nlength of array is = "+a.length+"\nsingle array element is = "+a[0]);
//		}
		
    }
	
	
	
	void inputArray()
	{
//		int a[] = new int[5];
//		System.out.println("enter array");
//		for (int i = 0; i < a.length; i++) {
//			
//			a[i]=scanner.nextInt();
//			
//		}
//		for (int j : a) {
//			System.out.print(" "+j+" ");
//		}
//		System.out.println("array is = "+a+"");
	}

    void addArrayElements(int b)
    {
//    	System.out.println("enter array elements");
//    	int a[] = new int[b];
//    	int add=0;
//    	for (int i = 0; i < a.length; i++) {
//    		a[i]=scanner.nextInt();
//			add=add+a[i];
//		}
//    	System.out.println(add);
    }
    
    void print(String a)
    {
    	System.out.println(a);
    }
    void printNo(int a)
    {
    	System.out.println(a);
    }
    
    void reverseArrayElements(int b)
    {
//    	int a[] = new int[b];
//    	print("enter array elements");
//    	for (int i = 0; i < a.length; i++) {
//			a[i]=scanner.nextInt();
//		}
    	    	
//    	for (int i : a) {
//    		printNo(i);			
//		}
    	
//    	REVERSING ARRAY
//    	int l =a.length-1;
//    	print("elements of array = "+a[3]+" ");
//    	System.out.println("length = "+l);
//    	for (int j = l; j >= 0; j--) {
//			System.out.print(" "+a[j]+" ");
//		}
    	
    	
    }
    
    void findSmallestNum(int no)
    {
//    	int a[] = new int[no];
//    	int c=0,min=0;
//    	print("enter array elements");
//    	
//    	for (int i = 0; i < a.length; i++) {
//		     a[i]=scanner.nextInt();
//		}
//    	for (int i = 0; i <= a.length-1; i++) {
//    		for (int j = i+1; j <= a.length-1; j++) {
//    			
//    			if(a[i]>=a[j])
//    			{
//    				c=a[i];
//    				a[i]=a[j];
//    				a[j]=c;    				
//    			}
//			}
//    		System.out.print(" "+a[i]+"\n");
//		}
//    	System.out.println("here minimum no is = "+a[0]);
    }
    
//    COPY ONE ARRAY TO ANOTHER
    
    void copyArray(int size)
    {
    	int arr1[] = new int[size];
    	int arr2[] = new int[arr1.length];
    	System.out.println("enter elements of arr1");
    	for (int i = 0; i < arr1.length; i++) {
		
    		arr1[i]=scanner.nextInt();
    		arr2[i]=arr1[i];
		}
    	System.out.println("arr1 is ");
    	for (int i : arr1) {
			System.out.print(" "+i+" ");
		}
    	System.out.println("\narr2 is ");
    	for (int j : arr2) {
			System.out.print(" "+j+" ");
		}
    	
    }
    
    
    
    
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
         ArrayExample arrayExample = new ArrayExample();
         System.out.println("how many elements you want to enter");
         int no = sc.nextInt();
//       arrayExample.printArray();
//       arrayExample.inputArray();
//       arrayExample.addArrayElements(no);
//       arrayExample.reverseArrayElements(no);
//       arrayExample.findSmallestNum(no);
         arrayExample.copyArray(no);
	}

}
