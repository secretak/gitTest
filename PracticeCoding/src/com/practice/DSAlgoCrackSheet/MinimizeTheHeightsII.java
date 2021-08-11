package com.practice.DSAlgoCrackSheet;

import java.util.Arrays;

public class MinimizeTheHeightsII {
	
	static int getMinDiff(int[] a, int n, int k) {
		
		/*
		 * System.out.println("main array before sorting : "); for (int i = 0; i <
		 * a.length; i++) { System.out.print(a[i]+", "); } System.out.println();
		 * 
		 * 
		 * Arrays.sort(a);
		 * 
		 * System.out.println("main array after sorting : "); for (int i = 0; i <
		 * a.length; i++) { System.out.print(a[i]+", "); } System.out.println();
		 * 
		 * 
		 * for(int i=0; i<n; i++){ //if(a[i]<max_a){ if(a[i]-k>=0) a[i] = a[i]-k; else
		 * a[i] = a[i]+k; //}
		 * 
		 * }
		 * 
		 * System.out.println("after changing the height of the element: "); for (int i
		 * = 0; i < a.length; i++) { System.out.print(a[i]+", "); }
		 * 
		 * System.out.println();
		 * 
		 * int min = a[0]; int max = a[0];
		 * 
		 * 
		 * for(int i=0; i<n; i++){ if(a[i]<min){ min = a[i]; } if(a[i]>max){ max = a[i];
		 * } }
		 * 
		 * 
		 * System.out.println("max" + max); System.out.println("min" + min);
		 * 
		 * return max-min;
		 */
        
		// code here
	       Arrays.sort(a);
	       
	       int minDiff = a[n-1] - a[0];
	       int smallest = a[0]+k;
	       int largest = a[n-1]-k;
	       int min = Integer.MAX_VALUE;
	       int max = Integer.MIN_VALUE;
	       
	       for(int i=0;i<n-1;i++){
	           min = Math.min(smallest,a[i+1]-k);
	           max  = Math.max(largest,a[i]+k);
	           if(min<0)
	           continue;
	           minDiff = Math.min(minDiff, max-min);
	       }
	       return minDiff;
		
		
        
    }

	public static void main(String[] args) {
		int[] a= new int[]{2, 6, 3, 4, 7, 2, 10, 3, 2, 1};
		int result = getMinDiff(a, a.length, 5 );
		System.out.println(result);

	}

}
