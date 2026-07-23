import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.Set;

class Solution {
	
	Set<Integer> valuesFound = new HashSet<>();

	public boolean findTarget(TreeNode root, int k) {
		return treeTraversal(root, k);
	}

	private boolean treeTraversal(TreeNode node, int k) {
		
		if (node == null) {
			return false;
		}

		int nodeValue = node.val;
		int diff = k - node.val;

		if(valuesFound.contains(diff))  {
			return true;
		}
		valuesFound.add(nodeValue);

		
		boolean left_result = treeTraversal(node.left, k);
		if (left_result) {
			return true;
		}
		boolean right_result = treeTraversal(node.right, k);

		return right_result;
	}
}
