package com.practice.geeksforgeeks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringIsogramCheck {

	public static void main(String[] args) throws IOException {
		
		BufferedReader bufferedReader = 
				new BufferedReader(new InputStreamReader(System.in));
		
		String S = bufferedReader.readLine();
		String tempString = S;
		int i;
		for (i = 0; i < S.length(); i++) {
			for (int j = i+1; j < S.length(); j++) {
				if(S.charAt(i)==tempString.charAt(j)) {
					System.out.println(1);
					System.exit(1);
				}
			}	
		}
		if(i>=S.length()) {
			System.out.println(0);
		}
		
		

	}

}
