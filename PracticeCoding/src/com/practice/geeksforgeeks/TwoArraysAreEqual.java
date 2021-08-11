package com.practice.geeksforgeeks;

public class TwoArraysAreEqual {

	public static void main(String[] args) {
		String S = "[ABC[23]][89]";
		int count = 1,pos = 0;
        for(int i=pos+1; i<S.length(); i++){
            if(count != 0){
                if(S.charAt(i)=='['){
                    count++;
                }
                if(S.charAt(i)==']'){
                    count--;
                }
            }
            else{
                System.out.println(i);
                break;
            }
            
        }
	}
}
