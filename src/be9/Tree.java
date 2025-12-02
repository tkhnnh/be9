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
 }
