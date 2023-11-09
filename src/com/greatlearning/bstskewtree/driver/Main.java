package com.greatlearning.bstskewtree.driver;

import java.util.Scanner;

import com.greatlearning.bstskewtree.flattenbst.FlattenAndPrintBST;
import com.greatlearning.bstskewtree.treenode.TreeNode;

/* DRIVER CLASS */
public class Main {

	public static void main(String[] args) {
		TreeNode root = null;
		int numOfValues = 0, val = 0;
		Scanner sc = new Scanner (System.in);
		
		/* TAKING INPUT FROM USER STARTS HERE */
		System.out.println ("Enter the number of keys you want in your binary search tree");
		// TRY CATCH BLOCK TO HANDLE INPUT MISMATCH EXCEPTION
		try
		{
			numOfValues = sc.nextInt();
		}
		catch (java.util.InputMismatchException e)
		{
			System.out.println ("Invalid Input. Please enter an integer.");
		}
		System.out.println ("Enter the " + numOfValues + " number of keys : ");
		// TRY CATCH BLOCK TO HANDLE INPUT MISMATCH EXCEPTION
		try
		{
			val = sc.nextInt();
			// CREATING ROOT OF THE BINARY SEARCH TREE
			root = new TreeNode (val);
		}
		catch (java.util.InputMismatchException e)
		{
			System.out.println ("Invalid Input. Please enter an integer.");
		}
		for (int i = 1; i < numOfValues; i++)
		{
			// TRY CATCH BLOCK TO HANDLE INPUT MISMATCH EXCEPTION
			try
			{
				val = sc.nextInt();
				root.insert(root, val);
			}
			catch (java.util.InputMismatchException e)
			{
				System.out.println ("Invalid Input. Please enter an integer.");
			}
		}
		/* TAKING INPUT FROM USER ENDS HERE */
		
		/* CALLING ACTUAL METHOD TO FLATTEN THE BST INTO A RIGHT SKEWED TREE */
		root = FlattenAndPrintBST.flattenBST(root);
		
		/* CALLING METHOD TO PRINT TRAVERSAL OF RIGHT SKEWED TREE */
		FlattenAndPrintBST.printSkewTreeTraversal(root);
		sc.close();
	}
}
