package com.practice.geeksforgeeks.dataStructure;

import java.util.Scanner;
import java.util.Stack;

public class PrenthesisStringBalaningCheck {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		Boolean isBoolean = true;
		
		String s = scanner.nextLine();
		
		Stack<Character> stack = new Stack<Character>();
		
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if(ch=='('||ch=='{'||ch=='[') {
				stack.push(ch);
				continue;
			}
			
			if(stack.isEmpty()) {
				isBoolean = false;
			}
			
			
			
			if(ch==')') {
				if(stack.peek()=='(') {
					stack.pop();
				}
				else {
					isBoolean = false;
					break;
				}
			}
			
			if(ch=='}') {
				if(stack.peek()=='{') {
					stack.pop();
				}
				else {
					isBoolean = false;
					break;
				}
			}
			
			
			if(ch==']') {
				if(stack.peek()=='[') {
					stack.pop();
				}
				else {
					isBoolean = false;
					break;
				}
			}
			
			
			
		}
		
		
		if(!stack.isEmpty()) {
			isBoolean = false;
		}
		
		if(isBoolean) {
			System.out.println("string is Balanced");
		}
		else {
			System.out.println("string is not Balanced");
		} 	
	}

}
