package com.revature.dsa;

//BST with Insertion Method

import java.util.Scanner;
public class BST12 {
public class TreeNode
{
  int data;
  TreeNode left;
  TreeNode right;
  TreeNode(int data)
  {
      this.data= data;
      this.left = this.right=null;
  }
}
static TreeNode root;
BST12()
{
  root=null;
}
public TreeNode insert(TreeNode root, int dataToBeInsert)
{
  if(root == null)
  {
      root = new TreeNode(dataToBeInsert);
      return root;
  }
  if(root.data >dataToBeInsert)
  {
      root.left=insert(root.left,dataToBeInsert);
  }
  else if(root.data <dataToBeInsert)
  {
      root.right=insert(root.right,dataToBeInsert);
  }
return root;
}

static void inorder(TreeNode root) {
	if(root == null)return ;
	inorder(root.left);
	System.out.print(root.data+" ");
	inorder(root.right);
}

static void preorder(TreeNode root) {
	if(root == null)return ;
	System.out.print(root.data+" ");
	preorder(root.left);
	preorder(root.right);
}

static void posorder(TreeNode root) {
	if(root == null)return ;
	posorder(root.left);
	posorder(root.right);
	System.out.print(root.data+" ");
}

public void insertintoTree(int dataToBeInsert)
{
  root= insert(root,dataToBeInsert);
}
public static void main(String[] args)
{
  BST12 bst =new  BST12();
  int n , num;
  Scanner Scan = new Scanner(System.in);
  System.out.println("Enter the numbers of input:");
  n=Scan.nextInt();
  for (int i = 0; i<n;i++)
  {
      num= Scan.nextInt();
      bst.insertintoTree(num);
  }
  System.out.print("Preorder :");
  preorder(root);
  System.out.print("Inorder :");
  inorder(root);
  System.out.print("Postorder :");
  posorder(root);
  
}



}
