package com.practice.geeksforgeeks.pc;

public class MyDeque<E> {
	
	Node<E> head, tail;
	
	public void addToHead(E data) {
		Node<E> toAddNode = new Node<>(data);
		if(head==null) {
			head = tail = toAddNode;
			return;
		}
		head.next = toAddNode;
		toAddNode.prev = head;
		head = toAddNode;
	}
	
	public E removeLast() {
		if(head==null) {
			return null;
		}
		Node<E> toRemove = tail;
		tail = tail.next;
		tail.prev = null;
		
		
		if(tail==null) {
			head = null;
		}
		
		return toRemove.data;
	}
	
	public static class Node<E>{
		E data;
		Node<E> next, prev;
		
		public Node(E data) {
			this.data = data;
			this.next= this.prev = null;
		}
	}

}
