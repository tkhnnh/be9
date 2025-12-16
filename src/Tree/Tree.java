package Tree;

import java.util.Scanner;

public class Tree {
	public int val;
	
	public Tree left;
	public Tree right;
	
	public static Tree treeBuilder(Scanner sc) {
		if (!sc.hasNextInt()) {
	        return null;
	    }

	    int val = sc.nextInt();
	    if (val == -1) return null;

	    Tree node = new Tree();
	    node.val = val;
	    node.left = treeBuilder(sc);
	    node.right = treeBuilder(sc);

	    return node;
	}
	
}
