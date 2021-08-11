package com.practice.DSAlgoCrackSheet;

import java.util.HashSet;
import java.util.Iterator;

public class UnionOf2Array {
	public static void main(String[] args) {
		int A[] = new int[] { 12, 3, 5, 7, 19 };
		int B[] = new int[] { 12, 3, 5, 7, 19, 20, 25};
        
        HashSet<Integer> union = new HashSet<Integer>();
        
        int temp = A.length+B.length;
        int i = 0;
        
        for (i = 0; i < A.length; i++) {
			union.add(A[i]);
		}
        
        for (int j = 0; j < B.length; j++) {
			union.add(B[j]);
		}
        
        
        Iterator<Integer> iterator = union.iterator();
        
        
        System.out.println("printing the SET : ");
        
        while(iterator.hasNext()) {
        	System.out.print(iterator.next()+",");
        }
        
        
        union.size();
        
	}

	

}
