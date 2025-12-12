package be9;

import java.util.ArrayList;

public class TreeNode {
	public int value;
	public int height;
	TreeNode left;
	TreeNode right;
	
	
	public ArrayList<TreeNode> children = new ArrayList<TreeNode>();
	
	public TreeNode() {
		
	}
	
	public TreeNode(int value) {
		this.value = value;
	}
}
