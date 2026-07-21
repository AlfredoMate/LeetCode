class Main {
	
	public static void main(String[] args) {
			

		final int val = 5;
		TreeNode root = new TreeNode(4);

		root.left = new TreeNode(2);
		root.right = new TreeNode(7);

		root.left.left = new TreeNode(1);
		root.left.right = new TreeNode(3);
		Solution solution = new Solution();
		TreeNode newTree = solution.insertIntoBST(root, val);
		solution.printTree(newTree);
	}



}
