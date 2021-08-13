package com.learning;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BranchSum {

	public static class Node {
		int value;
		Node left;
		Node right;

		Node(int value) {
			this.value = value;
			this.left = null;
			this.right = null;
		}

	}

	Node root;


	public static List<Integer> branchSums(Node root) {
		List<Integer> sums = new ArrayList<Integer>();
		calculateBranchSums(root, 0, sums);
		return sums;
	}

	public static void calculateBranchSums(Node node, int runningSum, List<Integer> sums) {
		if (node == null)
			return;
		int newRunningSum = runningSum + node.value;
		if (node.left == null && node.right == null) {
			sums.add(newRunningSum);
			return;
		}

		calculateBranchSums(node.left, newRunningSum, sums);
		calculateBranchSums(node.right, newRunningSum, sums);

	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		root.right.left = new Node(6);
		root.right.right = new Node(7);
		root.left.left.left = new Node(8);
		root.left.right.left = new Node(9);
		root.left.right.right = new Node(10);
		List<Integer> resArr = branchSums(root);
		for(int res : resArr) {
			System.out.println(res);
		}
	} 

}
