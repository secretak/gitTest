package com.practice.geeksforgeeks;

public class RemoveSpacesFromString {
	public static void main(String[] args) {
		String S = "geeks for geeks";
		StringBuffer sb= new StringBuffer();
		
		
		for (int i = 0; i < S.length(); i++) {
			if(S.charAt(i)!=' ') {
				sb.append(S.charAt(i));
			}
		}
		
		System.out.println(sb);
	}

}
