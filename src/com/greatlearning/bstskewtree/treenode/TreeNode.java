package com.greatlearning.bstskewtree.treenode;

/* CLASS TO CREATE BASIC STRUCTURE OF A TREENODE */
public class TreeNode {
	public int info;
	public TreeNode leftNode;
	public TreeNode rightNode;
	
	// PARAMETERIZED CONSTRUCTOR TO INITIALISE THE VALUES OF A TREENODE
	public TreeNode (int info)
	{
		this.info = info;
		leftNode = rightNode = null;
	}
	
	/* METHOD TO INSERT KEYS IN THE BINARY SEARCH TREE STARTS HERE */
	public TreeNode insert (TreeNode root, int key)
	{
		if (root == null)
		{
			root = new TreeNode (key);
			return root;
		}
		if (key < root.info)
		{
			root.leftNode = insert (root.leftNode, key);
		}
		else if (key > root.info)
		{
			root.rightNode = insert (root.rightNode, key);
		}
		return root;
	}
	/* METHOD TO INSERT KEYS IN THE BINARY SEARCH TREE ENDS HERE */
}
