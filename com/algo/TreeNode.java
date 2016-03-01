package com.algo;

public class TreeNode {
	
	private int key;
	private String value;
	private TreeNode left,right;
	
	public TreeNode(int key,String value){
		this.key = key;
		this.value = value;
		left = null;
		right=null;
	}
	
	public void setLeft(TreeNode node){
		this.left = node;
	}
	
	public void setRight(TreeNode node){
		this.right = node;
	}
	
	public TreeNode getLeft(){
		return this.left;
	}

	public TreeNode getRight(){
		return this.right;
	}
	
	public int getKey(){
		return this.key;
	}
	
	public String getValue(){
		return this.value;
	}
}
