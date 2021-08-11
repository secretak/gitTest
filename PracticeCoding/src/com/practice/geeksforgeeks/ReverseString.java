package com.practice.geeksforgeeks;


public class ReverseString {

	public static void main(String[] args) {
		String s = "Krishna";

		char[] c = s.toCharArray();

		String s1 = "";

		
		for(int i=c.length-1; i>=0; i--) { s1 = s1+c[i]; }
		 
		System.out.print(s1); 
		
		
		
		


	}

}
