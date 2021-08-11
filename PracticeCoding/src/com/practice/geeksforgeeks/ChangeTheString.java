package com.practice.geeksforgeeks;

public class ChangeTheString {
	public static void main(String[] args) {
		String S = "Krishna";
		
		if(S.charAt(0)>'A' && S.charAt(0)<'Z') {
			S = S.toUpperCase();
		}
		else {
			S = S.toLowerCase();
		}
	}

}
