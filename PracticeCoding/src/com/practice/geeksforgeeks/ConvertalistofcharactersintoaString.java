package com.practice.geeksforgeeks;



// optimized code

public class ConvertalistofcharactersintoaString {
	public static void main(String[] args) {
		StringBuffer S = new StringBuffer();
		 char[] a = {'e', 'e', 'b', 'a'};
	        for(int i=0; i<a.length; i++){
	            S.append(a[i]);
	        }
	        S.toString();
	}

}
