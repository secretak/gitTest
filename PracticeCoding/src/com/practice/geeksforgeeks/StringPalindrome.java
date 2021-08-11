package com.practice.geeksforgeeks;

public class StringPalindrome {

	public static void main(String[] args) {
		String S = "sbba",temp = "";
		int N = S.length()-1;
	    //System.out.println(S.charAt(N));
		while(N>=0){
	        temp += S.charAt(N);
	        N--;
	    }
		System.out.println("S : " + S);
	    System.out.println("temp : " + temp);
		System.out.println(temp.compareTo(S));
		System.out.println(temp.equals(S));
	    System.out.println(temp == S);
		/*
		 * if(temp.compareTo(S)){ System.out.println(1); } else{ System.out.println(0);
		 * }
		 */

	}

}
