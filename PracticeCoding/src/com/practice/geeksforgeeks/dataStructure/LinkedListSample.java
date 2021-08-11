package com.practice.geeksforgeeks.dataStructure;

public class LinkedListSample {

	static class Node{
		int data;
		Node next;
		Node(int data){
			this.data = data;
		}
	}
	
	static public Node head;
	
	public static void main(String[] args) {
		
		addHead(5);

	}

	public static void addHead(int i) {
		Node node = new Node(5); 
		if(head==null) {
			head = node;
		}
	}

}
