import java.util.ArrayDeque;

class Solution {



	public int dfsMaxDepth(final TreeNode root) {
		
		if (root == null) {
			return 0;
		}
		int left = dfsMaxDepth(root.left);
		int right = dfsMaxDepth(root.right);

		return 1 + Math.max(left, right);

	}





	
	public int bfsMaxDepth(final TreeNode root) {
		
		if (root == null) {
			return 0;
		}
	        ArrayDeque<TreeNode> nodes = new ArrayDeque<>();

		nodes.addLast(root);
		int current_level = 0;

		while(!nodes.isEmpty()) {
			
			int size = nodes.size();

			for (int i = 0; i < size; i++) {
				TreeNode current_node = nodes.poll();
				
				if (current_node.left != null) {
					nodes.addLast(current_node.left);
				}

				if (current_node.right != null) {
					nodes.addLast(current_node.right);
	
				}
			}
			current_level = current_level + 1;
		}
		return current_level;
	}
}
