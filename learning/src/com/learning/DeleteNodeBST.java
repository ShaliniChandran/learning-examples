package com.learning;


public class DeleteNodeBST {
	class Node {
		int val;
		Node left, right;
	}
	
	Node insert(Node root, int val) {
		if(root == null) {
			root = new Node();
			root.val = val;
			root.left = root.right = null;
		}
		else if(val < root.val) 
			root.left = insert(root.left, val);
		else
			root.right = insert(root.right, val);
		return root;
	}
	
	public int successor(Node root) {
		root = root.right;
		if(root.left != null) {
			root = root.left;
		}
		return root.val;
	}
	public int predecessor(Node root) {
		root = root.left;
		if(root.right != null) {
			root = root.right;
		}
		return root.val;
	}
	
	public Node deleteNode(Node root, int key) {
		if(root == null) return null;
		if(key > root.val) root.right = deleteNode(root.right,key);
		else if(key < root.val) root.left = deleteNode( root.left , key);
		else {
			// case-1 node is a leaf
			if(root.left == null && root.right == null) root = null;
			// case-2 node isnt a leaf and has got right child
			else if(root.right != null) {
				root.val = successor(root);
				root.right = deleteNode(root.right, root.val);
			}
			else {
				root.val = predecessor(root);
				root.left = deleteNode(root.left, root.val);
			}
		}
		return root;
	}
	public static void main(String args[]) {
		DeleteNodeBST delNodeBST = new DeleteNodeBST();		
		Node root = null;
		root = delNodeBST.insert(root,5); root = delNodeBST.insert(root,10);
		root = delNodeBST.insert(root,3); root = delNodeBST.insert(root,4); 
		root = delNodeBST.insert(root,1); root = delNodeBST.insert(root,11);
		root = delNodeBST.deleteNode(root, 5);
		delNodeBST.inorder(root);
		
	}

	private void inorder(Node root) {
		if(root == null) return;
		inorder(root.left);
		System.out.println(root.val);
		inorder(root.right);
		
	}
}
