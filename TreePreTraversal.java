import java.util.*;


public class TreePreTraversal {
	static TreeNode root;
	public class TreeNode {
	    int val;
	    TreeNode left;
	    TreeNode right;
	    TreeNode(int x) { val = x; }
	}
	public static void main (String [] args ) {
		TreePreTraversal tree = new TreePreTraversal();
		root = tree.new TreeNode(1);
		TreeNode child2 = root.left = tree.new TreeNode(2);
		TreeNode child3 = root.right = tree.new TreeNode(3);
		
		child2.left = tree.new TreeNode(4);
		child2.right = tree.new TreeNode(5);
		child3.left = tree.new TreeNode(6);
		child3.right = tree.new TreeNode(7);
		preorderTraversal(root);
		
	}
	 

	public static void preorderTraversal(TreeNode root) {	
		Stack<TreeNode> stack = new Stack<TreeNode>();
		stack.push(root);
	 
		while(!stack.empty()){
			TreeNode n = stack.pop();
			System.out.println(n.val);
			
			if(n.right != null){
	                stack.push(n.right);
			}
			if(n.left != null){
				stack.push(n.left);
			}
			
		}
	}
}


