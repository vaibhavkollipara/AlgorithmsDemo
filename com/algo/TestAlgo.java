package com.algo;

public class TestAlgo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTree tree = new BinaryTree();
		tree.addNode(25, "25");
		tree.addNode(75, "75");
		tree.addNode(50, "50");
		tree.addNode(10, "10");
		tree.addNode(90, "90");
		tree.addNode(60, "60");
		if(tree.findNode(30)){
			System.out.println("Found...");
		}else{
			System.out.println("Not Found...");
		}
	}

}
