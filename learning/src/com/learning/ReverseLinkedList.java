package com.learning;

public class ReverseLinkedList {
	public class Node{
		public int value;
		public Node next;
		
		public Node(int value) {
			this.value = value;
			this.next = null;
		}
	}
	public Node head = null;
	public Node tail = null;
	
	public void addNode(int value) {
		Node newNode = new Node(value);
		if(head == null) {
			head = newNode;
			tail = newNode;
		}else {
			tail.next = newNode;
			tail = newNode;
		}
	}
	
	public static void main(String[] args) {
		ReverseLinkedList obj = new ReverseLinkedList();
		obj.addNode(1);
		obj.addNode(2);
		obj.addNode(3);
		obj.addNode(4);
		
		Node current  = obj.reverse(obj.head);
		while (current != null) {
			System.out.println(current.value + " ");
			current = current.next;
		}
	}

	private Node reverse(Node head) {
		
		Node prev = null;
		Node current = head;
		Node tmp = null;
		while(current!=null) {
			tmp = current.next;
			current.next = prev;
			prev = current;
			current = tmp;
		}
		return prev;
	}

}
