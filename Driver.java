package com.rohit.main;
import com.rohit.service.FindTreeSum;
import com.rohit.service.Node;

public class Driver {

	public static void main(String[] args) {

		Node root = null;

		FindTreeSum findSP = new FindTreeSum();
		root = findSP.insert(root, 40);
		root = findSP.insert(root, 20);
		root = findSP.insert(root, 60);
		root = findSP.insert(root, 10);
		root = findSP.insert(root, 30);
		root = findSP.insert(root, 50);
		root = findSP.insert(root, 70);

		int sum =80 ;
		findSP.findPairForSum(root, sum);
  
	   }      
   
}
