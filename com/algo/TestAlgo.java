package com.algo;

public class TestAlgo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode t = new TreeNode(1, "1");
		t.setLeft(new TreeNode(2, "2"));
		t.setRight(new TreeNode(2, "2"));
		t.getLeft().setRight(new TreeNode(3, "3"));
		t.getRight().setLeft(new TreeNode(4, "4"));
		if(t.isSymmetric()){
			System.out.println("Symmetric");
		}else{
			System.out.println("Non Symmetric");
		}
		
	}

}
