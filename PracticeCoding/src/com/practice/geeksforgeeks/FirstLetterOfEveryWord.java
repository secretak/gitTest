package com.practice.geeksforgeeks;

public class FirstLetterOfEveryWord {

	public static void main(String[] args) {
		String S = "big is good";
		
		char[] a = S.toCharArray();
		        
		        String temp ="";
		        temp += a[0];
		        for(int i=0; i<a.length; i++){
		            
		            if(a[i]!=' '){
		                continue;
		            }
		            else{
		                temp += a[i+1];
		            }
		        }
		        System.out.println(temp);
		
			}

}
