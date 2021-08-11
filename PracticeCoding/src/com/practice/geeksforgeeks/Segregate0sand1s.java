package com.practice.geeksforgeeks;

public class Segregate0sand1s {
	public static void main(String[] args) {
		int N = 5,zeros = 0,ones = 0;
		char a[] = {0, 0, 1, 1, 0};
		
		for (int i = 0; i < a.length; i++) {
			if(a[i]== 0 ) {
				zeros++;
			}
			else {
				ones++;
			}
		}
		
		for (int i = 0; i < zeros; i++) {
			a[i] = 0;
		}
		
		for (int i = 0; i < ones; i++) {
			a[i] = 1;
		}
		
	}

}
