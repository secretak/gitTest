package com.practice.DSAlgoCrackSheet;

import java.util.Scanner;



public class ReverseAnArrayOrString01 {
	static class Pair {
		 
        int min;
        int max;
    }

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
		
		System.out.println("Array : ");
		
		
		printArray(a,size);
		
		Pair minmax = getMinMax(a,size);
		
		System.out.printf("\nMinimum element is %d", minmax.min);
        System.out.printf("\nMaximum element is %d", minmax.max);

	}

	

	static void printArray(int[] a,int size) {
		for (int i = 0; i < size; i++) {
			System.out.print(a[i]+", ");
		}
		
	}
	
	static Pair getMinMax(int[] a, int size) {
		Pair minmax = new Pair();
		
		minmax.min = a[0]; minmax.max = a[0];
		
		/*If there is only one element then return it as min and max both*/
        if (size == 1) {
            minmax.max = a[0];
            minmax.min = a[0];
            return minmax;
        }
		
		for (int i = 1; i < size; i++) {
			
			if(a[i] < minmax.min) {
				minmax.min = a[i];
			}
			
			if(a[i] > minmax.max) {
				minmax.max = a[i];
			}
			
		}
		return minmax;
		
	}

}
