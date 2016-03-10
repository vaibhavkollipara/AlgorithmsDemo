package com.algo;

public class TreeNode {

	private int key;
	private String value;
	private TreeNode left, right;

	public TreeNode(int key, String value) {
		this.key = key;
		this.value = value;
		left = null;
		right = null;
	}

	public void setLeft(TreeNode node) {
		this.left = node;
	}

	public void setRight(TreeNode node) {
		this.right = node;
	}

	public TreeNode getLeft() {
		return this.left;
	}

	public TreeNode getRight() {
		return this.right;
	}

	public int getKey() {
		return this.key;
	}

	public String getValue() {
		return this.value;
	}

	public boolean compare(TreeNode n1, TreeNode n2) {

		if (n1.getKey() == n2.getKey()) {
			if (!(n1.getLeft() == null && n2.getRight() == null))
				if (!(compare(n1.getLeft(), n2.getRight())))
					return false;
			if (!(n2.getLeft() == null && n1.getRight() == null))
				if (!(compare(n1.getRight(), n2.getLeft())))
					return false;

			return true;
		}
		return false;
	}

	public boolean isSymmetric() {

		return compare(this.getLeft(), this.getRight());
	}

}
