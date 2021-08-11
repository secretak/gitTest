package com.practice.geeksforgeeks;

public class RemoveDuplicatesFromString {
	public static void main(String[] args) {
		String S = "geeksforgeeks";
		String T = ""+S.charAt(0);
		
		for (int i = 0; i < S.length(); i++) {
			for (int j = 0; j < T.length(); j++) {
				if (S.charAt(i) != T.charAt(j)) {
					if(j==T.length()-1) {
						T += S.charAt(i);
					}
				}
				else {
					break;
				}
			}
		}
		System.out.println(T);
	
	}

}
