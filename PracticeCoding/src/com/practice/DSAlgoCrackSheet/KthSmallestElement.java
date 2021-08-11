package com.practice.DSAlgoCrackSheet;

import java.util.Arrays;

public class KthSmallestElement {
	public static void main(String[] args) {
		Integer arr[] = new Integer[] { 12, 3, 5, 7, 19 };
        int k = 2;
        
        
        
        System.out.println("Kth smallest element : "+ KthSmallest(arr,k));
	}

	private static int KthSmallest(Integer[] arr, int k) {
		
		Arrays.sort(arr);		
		return arr[k-1];
	}

}
