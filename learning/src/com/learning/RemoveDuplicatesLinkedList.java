package com.learning;

public class RemoveDuplicatesLinkedList {
	public class Node {
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
		if (head == null) {
			head = newNode;
			tail = newNode;
		} else {
			tail.next = newNode;
			tail = newNode;
		}

	}

	public void display() {
		Node current = head;
		if (head == null) {
			System.out.println("List is empty");
			return;
		}
		while (current != null) {
			System.out.println(current.value + " ");
			current = current.next;
		}
	}

	public Node removeDuplicatesFromLinkedList(Node head) {
		Node currentNode = null;
		Node nextDistinctNode = null;
		currentNode = head;
		while (currentNode != null) {
			nextDistinctNode = currentNode.next;
			while (nextDistinctNode != null && nextDistinctNode.value == currentNode.value) {
				nextDistinctNode = nextDistinctNode.next;
			}
			currentNode.next = nextDistinctNode;
			currentNode = nextDistinctNode;
		}
		return head;
	}

	public static void main(String[] args) {
		RemoveDuplicatesLinkedList rD = new RemoveDuplicatesLinkedList();
		rD.addNode(1);
		rD.addNode(1);
		rD.addNode(3);
		rD.addNode(4);
		rD.addNode(4);
		rD.addNode(4);
		rD.addNode(5);
		rD.addNode(6);
		rD.addNode(6);

		System.out.println("Original list :");
		rD.display();
		rD.removeDuplicatesFromLinkedList(rD.head);
		System.out.println("After removing duplicates :");
		rD.display();

	}

}
