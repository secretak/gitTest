package com.practice.geeksforgeeks;

import java.io.IOException;
import java.util.Scanner;

public class ConfussedPappu {
	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		
		
		
		System.out.println("Enter the number of Test Cases");
		int T = scanner.nextInt();
		
		while(T>0) {
			T--;
			System.out.println("actual remaining amount :  ");
			int N = scanner.nextInt();
			
			String S = "" + N;
			
			char[] a = S.toCharArray();
			
			for (int i = 0; i < a.length; i++) {
				if(a[i]=='6') {
					a[i]= '9'; 
				}
			}
			
			String temp = String.valueOf(a);
			
			System.out.println("vaalue of temp string after changing the value : "+temp);
			
			int tempInt = Integer.parseInt(temp);
			
			
			System.out.println("maximum possible extra amount ="+(tempInt-N));
			
			
			
		}

	}
}
