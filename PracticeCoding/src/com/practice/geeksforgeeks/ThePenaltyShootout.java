package com.practice.geeksforgeeks;

public class ThePenaltyShootout {
	public static void main(String[] args) {
		String S = "1012012112110";
		int count = 0;
		
		for (int i = 0; i < S.length(); i++) {
			if(S.charAt(i)=='2') {
				if (S.charAt(i+1)=='1') {
					if (i!=(S.length()-1)) {
						count++;
					}
				}
			}
		}
		
		System.out.println(count);
	}
	

}
