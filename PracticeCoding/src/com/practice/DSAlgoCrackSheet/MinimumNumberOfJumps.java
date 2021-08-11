package com.practice.DSAlgoCrackSheet;



public class MinimumNumberOfJumps {
	
	static int minJumps(int[] a) {
		
		int jumpCount = 0, num = 0;
		int n = a.length-1,i=0;;
		while(i<n){
			num = a[i];
			i= i + num;
			
			jumpCount++;
		}
		
		/*
		 * for (int i = 0; i < a.length-1;) { num = a[i]; i= i + num;
		 * 
		 * jumpCount++; }
		 */
		
		return jumpCount;
		
		
        
    }

	public static void main(String[] args) {
		int[] a= new int[]{1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9};
		int result = minJumps(a);
		System.out.println(result);

	}

}
