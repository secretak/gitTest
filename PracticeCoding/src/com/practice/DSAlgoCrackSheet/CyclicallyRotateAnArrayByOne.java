package com.practice.DSAlgoCrackSheet;




public class CyclicallyRotateAnArrayByOne {

	public static void main(String[] args) {
		
		int A[] = new int[] {1,2,3,4,5};
		
		int num = A[A.length-1];
		
		int i;
		
		for(i = A.length-1;i>0;i--) {
			A[i] = A[i-1]; 
		}
		
		A[i]= num; 
		
		for (int j = 0; j < A.length; j++) {
			System.out.print(A[j]+", ");
		}
		
        
		
		/*
		 * StringBuilder string = new StringBuilder(); 
		 * string.append(A[A.length-1]);
		 */
        
        //System.out.println(string);
        
		/*
		 * for (int i = 0; i < A.length-1; i++) { string.append(A[i]);
		 * 
		 * }
		 */
		  
		  
		 //System.out.println(string);
		 
			/*
			 * for (int i = 0; i < string.length(); i++) {
			 * System.out.print(string.charAt(i)+" ");
			 * 
			 * }
			 */
		 
	}

		

}
