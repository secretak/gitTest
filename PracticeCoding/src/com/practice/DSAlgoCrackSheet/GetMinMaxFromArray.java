package com.practice.DSAlgoCrackSheet;

import java.util.Scanner;

public class GetMinMaxFromArray {

	public static void main(String[] args) {
		System.out.println("working on reverse Array");
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the size of Array : ");
		int size = scanner.nextInt();
		
		int[] a = new int[size];
		
		System.out.println("Enter the element of Array : ");
		
		
		for(int i = 0; i<size;i++) {
			a[i]= scanner.nextInt();
		}
		
		System.out.println("Array before Reversing : ");
		
		printArray(a,size);
		
		reverseArray(a,0,size-1);
		
		System.out.println("Array After Reversing : ");
		
		printArray(a,size);

	}

	

	static void printArray(int[] a,int size) {
		for (int i = 0; i < size; i++) {
			System.out.print(a[i]+", ");
		}
		
	}
	
	static void reverseArray(int[] a, int start, int end) {
		int temp;
		while(start < end) {
			temp = a[start];
			a[start] = a[end];
			a[end] = temp;
			start++;
			end--;
		}
		
	}

}
