package com.practice.geeksforgeeks.pc;

import java.util.ArrayDeque;

public class MainClass{
	
	public static void main(String[] args) {
		ArrayDeque<Integer> ad = new ArrayDeque<Integer>();
		
		// check as queue
		
		/*
		 * ad.addFirst(12); ad.addFirst(23);
		 * 
		 * System.out.println(ad.pop()); System.out.println(ad.peek());
		 */
		
		
		// check as Stack
		
		ad.push(10);
		ad.push(12);
		ad.push(23);
		
		
		System.out.println(ad.pop());
		System.out.println(ad.pop());
		System.out.println(ad.pop());
		
	}

}
