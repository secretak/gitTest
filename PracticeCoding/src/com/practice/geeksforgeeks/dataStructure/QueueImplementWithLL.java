package com.practice.geeksforgeeks.dataStructure;



public class QueueImplementWithLL {
	static class Node{
		int data;
		Node next;
		
		Node(int data){
			this.data = data;
		}
	}
	public static Node head;
	public static void main(String[] args) {
		System.out.println("add(1)");
		add(1);
		
		System.out.println("add(2)");
		add(2);
		
		System.out.println("add(3)");
		add(3);
		
		
		System.out.println("stack print");
		printQueue();
		
		System.out.println("Removed item is : "+remove());
		
		System.out.println("Queue print : ");
		printQueue();
		
		
	}
	
	
	static void add(int data) {
		Node temp = head;
		Node node = new Node(data);
		if(head==null) {
			head = node;
		}
		else {
			while(temp!=null) {
				System.out.println(temp.data+", ");
				temp = temp.next;
			}
			temp = node;
		}
	}
	
	static int remove() {
		int temp = head.data;
		head.next = head;
		return temp;
	}
	
	
	int element() {
		int temp = head.data;
		return temp;
	}
	
	static void printQueue() {
		Node temp = head;
		while(temp!=null) {
			System.out.print(temp.data+", ");
			temp = temp.next;
		}
		System.out.println();
	}
}