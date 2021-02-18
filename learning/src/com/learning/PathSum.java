package com.learning;

import com.learning.BinarySearchTree.Node;

public class PathSum {
	public static boolean hasPathSum(Node root, int sum) {
		if (root == null) {
			return false;
		}
		sum -= root.key;
		if (root.left == null && root.right == null && sum == 0) {
			return true;
		}
		return hasPathSum(root.left, sum) || hasPathSum(root.right, sum);

	}

	public static void main(String[] args) {
		
		BinarySearchTree tree = new BinarySearchTree();
		 tree.insert(5);
		 tree.insert(4);
		 tree.insert(8);
		 tree.insert(11);
		 tree.insert(13);
		 tree.insert(4);
		 tree.insert(7);
		 tree.insert(2);
		 tree.insert(1);
		 tree.root.key = 5;
        int targetSum = 12;
        boolean res = hasPathSum(tree.root, targetSum);
        System.out.println("PathSum :" +res);
		
	}

}
