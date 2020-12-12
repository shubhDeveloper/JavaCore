package com.examples;

import java.util.Scanner;

import com.sun.jdi.IntegerValue;

public class TwoDArray {

	Scanner s = new Scanner(System.in);
	void twoDArrayDeclaration()
	{
		
//		int a[][]=new int[3][3];
//		a[0][0]=1;
//		a[0][1]=2;
//		a[0][2]=3;
//		a[1][0]=4;
//		a[1][1]=5;
//		a[1][2]=6;
//		a[2][0]=7;
//		a[2][1]=8;
//		a[2][2]=9;
//		for (int i = 0; i < a.length; i++) {
//			for (int j = 0; j < a.length; j++) {
//				System.out.print(" "+a[i][j]+" ");
//			}
//		    System.out.println("");
//			
//		}
//		
//		for (int[] i : a) {
//			for (int js : i) {
//						
//				System.out.println("i is = "+i);
//				System.out.print(js);
//			}
//			System.out.println("");
//		}
	    
	}
	
	void input2DArray(int r,int c)
	{
		int a[][] = new int[r][c];
		int row=1;
		for (int i = 0; i < r; i++) {
			System.out.println("enter row "+row);
			for (int j = 0; j < c; j++) {
				a[i][j]=s.nextInt();
			}
			row++;
		}
		for (int[] is : a) {
			for (int is2 : is) {
				System.out.print("  "+is2+"  ");
			}
			System.out.println("");
			
		}
	}
	
	
	public static void main(String[] args) {
		
	    Scanner scanner = new Scanner(System.in);
	    
		TwoDArray array = new TwoDArray();
//		System.out.println("enter array size");
//		int a = scanner.nextInt();
//		int arr[] = new int[a];
//		for (int i = 0; i < arr.length; i++) {
//			arr[i] = scanner.nextInt();
//		}
		System.out.println("enter row of array");
		int r=scanner.nextInt();
		System.out.println("enter column of array");
		int c=scanner.nextInt();
		array.input2DArray(r,c);
//		array.twoDArrayDeclaration();

	}

}
