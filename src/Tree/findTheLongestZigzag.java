package Tree;

import java.util.Scanner;

public class findTheLongestZigzag {
	
	public static int solution(Tree root) {
		if (root == null) return 0;
		
		int left = dfs(root.left, true, true, 0);
		int right = dfs(root.right, false, false, 0);
		
		return Math.max(left, right);
	}
	
	public static int dfs(Tree node, boolean curPos, boolean prePos, int len) {
		if (node == null) return len;
		
		if (curPos != prePos) len++;
		
		int left = dfs(node.left, true, curPos, len);
		int right = dfs(node.right, false, curPos, len);
		
		return Math.max(left, right);
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner("5 5 -1 5 5 5 5 -1 5 -1 -1 5 5 -1 -1 -1 -1 -1 5 5 -1 5 -1 -1 5 -1 -1");
	    Tree root = Tree.treeBuilder(sc);
	    System.out.println(solution(root));
	}
}
