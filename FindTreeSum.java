package com.rohit.service;
 
import java.util.HashSet;

public class FindTreeSum {

	 public Node insert(Node root, int key) {
		if (root == null)
			return new Node(key);
		if (key < root.nodeData)
			root.leftNode = insert(root.leftNode, key);
		else
			root.rightNode = insert(root.rightNode, key);
		return root;

	}

	private boolean findpairUtil(Node root, int sum, HashSet<Integer> set) {

		if (root == null) {
			return false;
		}
		if (findpairUtil(root.leftNode, sum, set)) {
			return true;
		}
		if (set.contains(sum - root.nodeData)) {
			System.out.println("pair is found (" + (sum - root.nodeData) + ", " + root.nodeData + ")");
			return true;
		} else

			set.add(root.nodeData);
		return findpairUtil(root.rightNode, sum, set);

	}  

	public void findPairForSum(Node root, int sum) {

		HashSet<Integer> set = new HashSet<Integer>();
		if (!findpairUtil(root, sum, set))
			System.out.println("pairs do not exist");

	}        

}
