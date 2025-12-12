package be9;

import java.util.LinkedList;
import java.util.Queue;

public class Tree {
	public TreeNode root;
	
	
	public TreeNode searchDFS(int value) {
		return searchRecursively(root, value);
	}
	
	private TreeNode searchRecursively(TreeNode node, int value) {
		if (node == null) return null;
		
		
		if (node.value == value) return node;
		
		for (TreeNode child : node.children) {
			TreeNode found = searchRecursively(child, value);
			if( found != null) {
				return found;
			}
		}
		return null;
	}
	
	public TreeNode searchBFS(int value){
		if (root == null)  return null;
		
		Queue<TreeNode> queue =  new LinkedList<>();
		queue.add(root);
		
		while (!queue.isEmpty()) {
			TreeNode current = queue.poll();
			
			
			if (current.value == value) {
				return current;
			}
			
			for (TreeNode child : current.children) {
				queue.add(child);
			}
		}
		return null;
		
	}
	public int height(TreeNode node) {
		if (node == null) return 0;
		
		return 1 + Math.max(height(node.left), height(node.right));
	}
	
	public int getBalance(TreeNode node) {
		if (node == null) return 0;
		
		return height(node.left) - height(node.right);
	}
	
	public TreeNode rightRotate(TreeNode node) {
		TreeNode newNode = node.left;
		TreeNode subNode = newNode.right;
		
		newNode.right =  node;
		node.left = subNode;
		
		node.height = 1 + Math.max(height(node.left), height(node.right));
		newNode.height = 1 + Math.max(height(newNode.left), height(newNode.right));
		
		return newNode;
	}
	
	public TreeNode leftRotate(TreeNode node) {
		TreeNode newNode = node.right;
		TreeNode subNode = newNode.left;
		
		newNode.left = node;
		node.right = subNode;
		
		node.height = 1+ Math.max(height(node.left), height(node.right));
		
		newNode.height = 1+ Math.max(height(newNode.left), height(newNode.right));
		
		return newNode; 
	}
	
	public TreeNode insert(TreeNode node, int val) {
		if (node == null) return node;
		
		else if(val < node.value) {
			node.left = insert(node.left, val);
		}else {
			node.right = insert(node.right, val);
		}
		
		node.height = height(node);
		
		int balance = getBalance(node);
		
		//Left Left
		if (balance > 1 && getBalance(node.left) >= 0) {
			return rightRotate(node);
		}
		
		//Left Right
		if (balance > 1 && getBalance(node.left) < 0) {
			node.left = leftRotate(node.left);
			return rightRotate(node);
		}
		
		//Right right
		if (balance < -1 && getBalance(node) <=0) {
			return leftRotate(node);
		}
		
		//Right Left
		if (balance < -1 && getBalance(node) > 0) {
			node.right = rightRotate(node.right);
			return rightRotate(node);
		}
		return node;
	}
 }

