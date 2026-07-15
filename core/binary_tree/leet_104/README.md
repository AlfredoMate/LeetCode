Problem: max depth of binary tree

Solution: 

We use Depth First Search algorithm. Recursively, we find the maximum depth between left and right node each time. 

Time complexity: O(number of nodes)	

Space comlexity: 
	- Best case (balanced tree): log2 n
	- Worst case (skewed tree): n --> height equals the number of nodes 



public int maxDepth(TreeNode node) {

	if (node == null) {
		return 0;
	}

	int left_depth = maxDepth(node.left);
	int right_depth = maxDepth(node.right);
	
	return 1 + Math.max(left_depth, right_depth);
}

