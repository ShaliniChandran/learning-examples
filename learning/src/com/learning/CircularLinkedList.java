package com.learning;

public class CircularLinkedList {
	public static class Node{
		int value;
		Node next;
		public Node(int value) {
			this.value = value;
			this.next = null;
		}
	}
	public static void main(String[] args) {
		CircularLinkedList obj = new CircularLinkedList();
		Node n1 = new Node(1);
		Node n2 = new Node(2);
		Node n3 = new Node(3);
		Node n4 = new Node(4);
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = null;
		boolean isCircular = obj.isCircularLinkedList(n1);
		System.out.println("LinkedList is circular :" +isCircular);
	}
	private boolean isCircularLinkedList(Node head) {
		if(head == null) {
			return false;
		}else {
			Node temp = head;
			do {
				temp = temp.next;
				
			}while(temp != null && temp != head);
			return (temp == head);
		}
		
	}

}
