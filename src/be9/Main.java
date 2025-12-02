package be9;

public class Main {
	public static void  main(String[] args) {
		Tree tree = new Tree();
		tree.root = new TreeNode();
		tree.root.value = 1;
		TreeNode node2 = new TreeNode(2);
		node2.value = 2;
		
		TreeNode node3 = new TreeNode(3);
		node3.value = 3;
		
		TreeNode node4 = new TreeNode(4);
		node4.value = 4;
		tree.root.children.add(node2);
		tree.root.children.add(node3);
		tree.root.children.add(node4);
		
		
		TreeNode node5 = new TreeNode(5);
		node5.value = 5;
		
		TreeNode node6 = new TreeNode(6);
		node6.value = 6;
		node3.children.add(node5);
		node3.children.add(node6);
		
		
		TreeNode node7 = new TreeNode(7);
		node7.value = 7;
		node3.children.add(node7);
		
		
		
		TreeNode node10 = new TreeNode(10);
		node10.value = 10;
		
		TreeNode node8 = new TreeNode(8);
		node8.value = 8;
		
		node5.children.add(node10);
		node5.children.add(node8);
		
		
		
	}
	
	
}
