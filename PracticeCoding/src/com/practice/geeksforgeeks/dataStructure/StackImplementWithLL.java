package com.practice.geeksforgeeks.dataStructure;

import com.practice.geeksforgeeks.dataStructure.LinkedList.Node;

public class StackImplementWithLL {
	static class Node{
		int data;
		Node next;
		
		Node(int data){
			this.data = data;
		}
	}
	public static Node head;
	public static void main(String[] args) {
		System.out.println("push(1)");
		push(1);
		
		System.out.println("push(2)");
		push(2);
		
		System.out.println("push(3)");
		push(3);
		
		
		System.out.println("stack print");
		printStack();
		
		System.out.println("poped item is : "+pop());
		
		System.out.println("stack print");
		printStack();
		
		
	}
	
	static void push(int data) {
		Node node = new Node(data);
		if(head==null) {
			head = node;
		}
		else {
			node.next = head;
			head = node;
		}
	}
	
	static int pop() {
		int temp = head.data;
		head.next = head;
		return temp;
	}
	
	
	int peek() {
		int temp = head.data;
		return temp;
	}
	
	static void printStack() {
		Node temp = head;
		while(temp!=null) {
			System.out.print(temp.data+", ");
			temp = temp.next;
		}
		System.out.println();
	}
}