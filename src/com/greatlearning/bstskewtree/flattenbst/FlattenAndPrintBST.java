package com.greatlearning.bstskewtree.flattenbst;

import com.greatlearning.bstskewtree.treenode.TreeNode;

/* CLASS CONTAINING ACTUAL METHOD TO FLATTEN A BST INTO RIGHT SKEWED TREE */
public class FlattenAndPrintBST {
	static TreeNode prevRoot = null;
	static TreeNode skewedTreeRoot = null;
	
	/* ACTUAL LOGIC FOR CONVERSION STARTS HERE */
	public static TreeNode flattenBST (TreeNode root)
	{
		if (root == null)
		{
			return null;
		}
		flattenBST (root.leftNode);
		if (skewedTreeRoot == null)
		{
			skewedTreeRoot = root;
			prevRoot = root;
		}
		else
		{
			prevRoot.rightNode = root;
			root.leftNode = null;
			prevRoot = root;
		}
		flattenBST (root.rightNode);
		return skewedTreeRoot;
	}
	/* ACTUAL LOGIC FOR CONVERSION ENDS HERE */
	
	/* LOGIC FOR TRAVERSAL OF RIGHT SKEWED TREE STARTS HERE */
	public static void printSkewTreeTraversal (TreeNode root)
	{
		if (root == null)
		{
			return;
		}
		System.out.print (root.info + " ");
		printSkewTreeTraversal (root.rightNode);
	}
	/* LOGIC FOR TRAVERSAL OF RIGHT SKEWED TREE ENDS HERE */
}
