class Solution {

	private int max_diameter = 0;

	public int diameterOfBinaryTree(TreeNode root) {
		
		height(root);
		return max_diameter;
	}

	private int height(TreeNode node) {

		if (node == null) {
			return 0;
		}

		int heightLeft = height(node.left);
		int heightRight = height(node.right);

		int diameter = heightLeft + heightRight;
		max_diameter = Math.max(max_diameter, diameter);

		return Math.max(heightLeft, heightRight) + 1;
	}
}
