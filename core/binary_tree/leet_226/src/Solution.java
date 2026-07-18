import java.util.ArrayDeque;

class Solution {

	public TreeNode invertTree(TreeNode root) {
		
		if (root == null) {
			return null;	
		}
		
		invertTree(root.left);
		invertTree(root.right);

		TreeNode tmp = root.right;
		root.right = root.left;
		root.left = tmp;

		return root;
	}
	
	//Helper method to print the tree in stdout
	public void printTree(TreeNode root) {
		
		ArrayDeque<TreeNode> nodes = new ArrayDeque<>();
		int level = 0;
		nodes.addLast(root);
		
		while(!nodes.isEmpty()) {
			
			int size = nodes.size();
			System.out.println("--- Level " + level + " ---");
			
			for (int i = 0; i < size; i++) {
				
				TreeNode currentNode = nodes.poll();
				System.out.print(currentNode.val + " ");
				if (currentNode.left != null) {
					nodes.addLast(currentNode.left);
				}
				if (currentNode.right != null) {
					nodes.addLast(currentNode.right);
				}
			}
			level = level + 1;
			System.out.println();
		}
		

			
	}

}
