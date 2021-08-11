package com.practice.geeksforgeeks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CountingGame {

	public static void main(String[] args) throws IOException{
		BufferedReader bufferedReader = 
				new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(bufferedReader.readLine());
		
		while(T>0) {
			
			String S= bufferedReader.readLine();
			char[] a = S.toCharArray();
			char c = 'c';
			
			int count = 1;
			
			for (int i = 0; i < a.length; i++) {
				if(a[i]>='A' && a[i]<='Z') {
					count++;
				}
			}
			System.out.println(count);
			if(c>='A' && c<='Z') {
				System.out.println("charcter is in upper case");
			}
			else {
				System.out.println("charcter is in lower case");
			}
			T--;
		}
	}
}
