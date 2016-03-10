package com.algo;

public class BinaryTree {

	private TreeNode root;

	public void addNode(int key, String value) {
		TreeNode newNode = new TreeNode(key, value);
		if (root == null) {
			root = newNode;
			return;
		} else {
			TreeNode focus = root;
			TreeNode parent;
			while (true) {
				parent = focus;
				if (focus.getKey() != key) {
					if (focus.getKey() < key) {
						focus = focus.getRight();
						if (focus == null) {
							parent.setRight(newNode);
							return;
						}
					} else {
						focus = focus.getLeft();
						if (focus == null) {
							parent.setLeft(newNode);
							return;
						}
					}
				}

			}
		}
	}

	public boolean findNode(int key) {
		TreeNode focus = root;
		boolean found = false;
		while (focus != null) {
			if (focus.getKey() == key) {
				found = true;
				break;
			} else {
				if (focus.getKey() < key) {
					focus = focus.getRight();
				} else {
					focus = focus.getLeft();
				}
			}
		}
		return found;
	}

	public void inorder(TreeNode focus) {
		if (focus != null) {
			inorder(focus.getLeft());
			System.out.println(focus.getKey());
			inorder(focus.getRight());
		}
	}

	public void preorder(TreeNode focus) {
		if (focus != null) {
			System.out.println(focus.getKey());
			preorder(focus.getLeft());
			preorder(focus.getRight());
		}
	}

	public void postorder(TreeNode focus) {
		if (focus != null) {
			postorder(focus.getLeft());
			postorder(focus.getRight());
			System.out.println(focus.getKey());
		}
	}

	public TreeNode getRoot() {
		return root;
	}

	public int findHeight(TreeNode node) {
		if (node == null)
			return 0;
		else {
			return 1 + Math.max(findHeight(node.getLeft()), findHeight(node.getRight()));
		}
	}

	public int getHeight() {

		return findHeight(getRoot());
	}

}
