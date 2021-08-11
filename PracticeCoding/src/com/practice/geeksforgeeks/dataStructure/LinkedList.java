package com.practice.geeksforgeeks.dataStructure;



public class LinkedList {
	
	static class Node{
		private Node next;
		private int data;
		
		public Node(int data, Node next){
			this.data = data;
			this.next = next;
			
		}
	}
	
	
	private static Node head;

			
			
	public static void main(String[] args) 
	{
		//addHead(5);
		System.out.println("adding 3 in list");
		
		addHead(3);
		
		System.out.println("adding 2 in list");
		addHead(2);
		
		System.out.println("adding 1 in list");
		addHead(1);
		
		//addTail(6);
		
		//System.out.println("adding 4 in list");
		//sortInsert(4);
		
		//removeHead();
		
		System.out.println("deleting 3 from list");
		deleteNode(3);
		
		System.out.println("printing the list");
		printLinkedList();
	
		//boolean X= searchingElement(4);
		/*
		 * if(X==true) { System.out.println("element "+4+" is available"); } else {
		 * System.out.println("element "+4+" is NOT available"); }
		 */
		
		
	}


	
	private static void deleteNode(int i) {
		
		Node temp = head;
		
		if(head==null) {
			System.out.println("list is empty");
		}
		while(temp.next!=null) {
			if(temp.next.data==i) {
				//temp.next = temp.next.next;
			}
			
			temp = temp.next;
		}		
	}



	private static void removeHead() {
		if(head == null) {
			System.out.println("list is empty");
		}
		else {
			head = head.next;
		}
		
	}

	private static boolean searchingElement(int i) {
		Node temp = head;
		if(head == null) {
			return false;
		}
		while(temp!=null) {
			
			if(temp.data==i) {
				
				return true;
			}
			temp = temp.next;
		}
		return false;
	}

	private static void sortInsert(int i) {
		Node node = new Node(i, null);
		Node temp = head;
		
		if(head==null) {
			head = node;
		}
		while(temp.next!=null && temp.next.data < i) {
			temp = temp.next;
		}
		
		node.next=temp.next;
		
		temp.next = node;
	}

	private static void addTail(int val) {
		Node node = new Node(val,null);
		Node temp = head;
		if(head==null) {
			head = node;
		}
		while(temp.next!=null) {
			temp = temp.next;
		}
		
		
		temp.next = node;
		
		
	}

	private static void printLinkedList() {
		Node temp = head;
		while(temp!=null) {
			System.out.print(temp.data+", ");
			temp = temp.next;
		}
		System.out.println();
	}

	private static void addHead(int value) {
		Node node = new Node(value, null);
		
		if(head==null) {
			head = node;
		}
		else {
			
			node.next = head;
			head = node;
		}
		
		
	}
}