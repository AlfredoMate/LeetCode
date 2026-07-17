class Main {
	
	public static void main(String[] args) {

		final int targetSum = 22;

		TreeNode node1 = new TreeNode(7);
		TreeNode node2 = new TreeNode(2);
		TreeNode node3 = new TreeNode(11, node1, node2);

		TreeNode node4 = new TreeNode(4, node3, null); // left child of 5

		TreeNode node5 = new TreeNode(13);
		TreeNode node6 = new TreeNode(1);
		TreeNode node7 = new TreeNode(4, null, node6); // right child of 8

		TreeNode node8 = new TreeNode(8, node5, node7);

		TreeNode root = new TreeNode(5, node4, node8);

		Solution solution = new Solution();
		System.out.println(solution.hasPathSum(root, targetSum));
	}

}
