package com.practice.geeksforgeeks;



public class SumOfNumbersInString {

	public static void main(String[] args) {
		String s = "ka2po2o22o2r2";
		String temp = new String();
		System.out.println(temp.isEmpty());
		int sum=0,tempInt=0;
        for(int i=0; i<s.length(); i++){
        	if(!s.isEmpty()) {
	            if(Character.isDigit(s.charAt(i))){
	            	temp += s.charAt(i);
	            	System.out.println("value of temp in if: "+ temp);
	            }
	            else{
	            	if(!temp.isBlank()) {
	            		System.out.println("value of temp in else: "+ temp);
		                tempInt = Integer.parseInt(temp);
		                sum += tempInt;
		                temp = "";
	            	}
	            }
        	}
        }
        if(!temp.isEmpty()) {
        	System.out.println("value of temp in outside the loop: "+ temp);
        	tempInt = Integer.parseInt(temp);
        	sum += tempInt;
        	
        }
        System.out.println("final value of sum : "+sum);
	}

}
