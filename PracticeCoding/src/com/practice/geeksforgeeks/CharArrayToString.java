package com.practice.geeksforgeeks;

public class CharArrayToString {

	public static void main(String[] args) {
		char arr[] = {'k','r','i','s','h','n','a'};
		
		String S = "";

		//S = String.valueOf(arr);
		
		for (int i = 0; i < arr.length; i++) {
			S += arr[i];
		}
		
		
		
		
		System.out.println(S);

	}

}
