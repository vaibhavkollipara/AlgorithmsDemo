package com.algo;

public class TestAlgo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTree b = new BinaryTree();
		b.addNode(10, "10");
		System.out.println("Height : "+b.getHeight());
		b.addNode(2, "2");
		System.out.println("Height : "+b.getHeight());
		b.addNode(13, "13");
		System.out.println("Height : "+b.getHeight());
		
	}

}
