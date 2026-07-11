import java.util.ArrayDeque;

class Solution {

	private ArrayDeque<TreeNode> nodes = new ArrayDeque<>();	
	
	public int minDepth(final TreeNode root) {

		if (root == null) {
			return 0;
		}
		return bfs(root);	
	}

	private int bfs(TreeNode root) {

		nodes.addLast(root);
		int current_level = 0;
		 while(!nodes.isEmpty()) {
			int size = nodes.size();			
			for (int i = 0; i < size; i++) {
				TreeNode current_node = nodes.poll();	
				if (current_node.right == null && current_node.left == null) {
					return current_level + 1;
				}

				if (current_node.left != null) {
					nodes.addLast(current_node.left);
				}

				if (current_node.right != null) {
					nodes.addLast(current_node.right);
				}

			}
			current_level = current_level + 1;
		}
		return 0;
		
	}	
}
