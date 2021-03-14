package com.learning;



public class MergeLinkedList {

	  public ListNode head = null;  
	  public ListNode tail = null;  

	public ListNode mergeTwoLists(ListNode p, ListNode q, ListNode sorting) {
		ListNode new_head = null;
		if(p == null) return q;
		if(q == null) return p;
        if( p!= null  && q != null) {
        	if(p.val < q.val) {
        		sorting = p;
        		p = sorting.next;
        	}else {
        		sorting = q;
        		q = sorting.next;
        	}
        }
        new_head = sorting;
        while (p != null && q != null) {
        	if(p.val < q.val) {
        		sorting.next = p;
        		sorting =p;
        		p= sorting.next;
        	}else {
        		sorting.next = q;
        		sorting =q;
        		q = sorting.next;
        	}
        	
        	
        }
        if (p == null) sorting.next = q;
    	if (q == null) sorting.next = p;
    	return new_head;
    }
	public void addToTheLast(int data) {
		//create new node
		ListNode newNode = new ListNode(data);
		if(head == null) {
			head = newNode;
			tail = newNode;
		}else {
			tail.next = newNode;
			tail = newNode;
		}
	}

	public static void main(String[] args) {

        MergeLinkedList llist1 = new MergeLinkedList();
        MergeLinkedList llist2 = new MergeLinkedList();
         
        // Node head1 = new Node(5);
        llist1.addToTheLast(1);
        llist1.addToTheLast(2);
        llist1.addToTheLast(4);
         
        // Node head2 = new Node(2);
        llist2.addToTheLast(1);
        llist2.addToTheLast(3);
        llist2.addToTheLast(4);
        ListNode sorting = null;
         
        llist1.head = new MergeLinkedList().mergeTwoLists(llist1.head, 
                                            llist2.head,sorting);
        ListNode temp = llist1.head;
        while (temp != null)
        {
            System.out.print(temp.val + " ");
            temp = temp.next;
        } 
		
	}

}
