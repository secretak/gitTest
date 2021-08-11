package com.practice.geeksforgeeks;

import java.io.BufferedReader;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class RotateArray {

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		
		
		//BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter the number of Test Cases");
		int T = scanner.nextInt();//Integer.parseInt(bufferedReader.readLine());
		
		while(T>0) {
			T--;
			System.out.println("Enter the size of the array : ");
			int N = scanner.nextInt();//Integer.parseInt(bufferedReader.readLine());
			System.out.println("Enter the number size of rotation : ");
			int D = scanner.nextInt();//Integer.parseInt(bufferedReader.readLine());
			
			
			int[] A = new int[N];
			int[] B = new int[N];
			
			for(int i=0; i<N; i++) {
				System.out.println("enter the element of the array");
				A[i]= scanner.nextInt();//Integer.parseInt(bufferedReader.readLine()); 
			}
			
			System.out.println("Array A is : ");
			for (int i = 0; i < N; i++) {
				System.out.print(A[i]+", ");
			}
			
			
			int j = 0, k = N-D;
			for (int i = 0; i < N; i++) {
				if(k!=N) {
					B[k]= A[i];
					k++;
				}
				else {
					B[j]= A[i];
					j++;
				}
			}
			System.out.println("Array B is : ");
			for (int i = 0; i < N; i++) {
				System.out.print(B[i]+", ");
			}
			
			
			
		}

	}

}
