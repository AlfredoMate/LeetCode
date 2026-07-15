import java.util.List;
import java.util.ArrayList;
import java.util.ArrayDeque;

class Solution {

	public List<List<Integer>> levelOrder(TreeNode root) {
		
		
		List<List<Integer>> nodesByLevel = new ArrayList<>();


		if (root == null) {
			return nodesByLevel;
		}

		ArrayDeque<TreeNode> nodes = new ArrayDeque<>();
		nodes.addLast(root);

		while(!nodes.isEmpty()) {
			
			int size = nodes.size();
			List<Integer> nodesCurrentLevel = new ArrayList<>();
			
			for (int i = 0; i < size; i++) {
				
				TreeNode currentNode = nodes.poll();
				nodesCurrentLevel.add(currentNode.val);
				
				if (currentNode.left != null) {
					nodes.addLast(currentNode.left);
				}
				
				if (currentNode.right != null) {
					nodes.addLast(currentNode.right);
				}

				
				
			}
			nodesByLevel.add(nodesCurrentLevel);
		}
		return nodesByLevel;
	}
}
