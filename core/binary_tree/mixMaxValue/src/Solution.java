import java.util.ArrayDeque;

class Solution {
		
	public int minValueBFS(TreeNode root) {
		
		ArrayDeque<TreeNode> nodes = new ArrayDeque<>();
		int globalMin = Integer.MAX_VALUE;
		nodes.addLast(root);
		
		while (!nodes.isEmpty()) {
			TreeNode currentNode = nodes.poll();
			globalMin = Math.min(globalMin, currentNode.val);
			if (currentNode.left != null)  {
				nodes.addLast(currentNode.left);
			}	
			if (currentNode.right != null)  {
				nodes.addLast(currentNode.right);
			}	
			
		}
		return globalMin;		
	}


	public int minValueDFS(TreeNode root, int globalMin){
		if (root == null) {
			return globalMin;
		}

		int minLeft = minValueDFS(root.left, Math.min(root.val, globalMin));
		int minRight = minValueDFS(root.right, Math.min(root.val, globalMin));

		return Math.min(minLeft, minRight);
		
	}
	
	public int maxValueBFS(TreeNode root) {
		
		ArrayDeque<TreeNode> nodes = new ArrayDeque<>();
		int globalMax = Integer.MIN_VALUE;
		nodes.addLast(root);
		
		while (!nodes.isEmpty()) {
			TreeNode currentNode = nodes.poll();
			globalMax = Math.max(globalMax, currentNode.val);
			if (currentNode.left != null)  {
				nodes.addLast(currentNode.left);
			}	
			if (currentNode.right != null)  {
				nodes.addLast(currentNode.right);
			}	
			
		}
		return globalMax;		
	}
	
	public int maxValueDFS(TreeNode root, int globalMax){
		if (root == null) {
			return globalMax;
		}

		int maxLeft = maxValueDFS(root.left, Math.max(root.val, globalMax));
		int maxRight = maxValueDFS(root.right, Math.max(root.val, globalMax));

		return Math.max(maxLeft, maxRight);
		
	}
}
