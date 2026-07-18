class Main {
	
	public static void main(String[] args) {
			

		final int val = 2;
		TreeNode root = new TreeNode(4);

		root.left = new TreeNode(2);
		root.right = new TreeNode(7);

		root.left.left = new TreeNode(1);
		root.left.right = new TreeNode(3);
		Solution solution = new Solution();
		TreeNode detachedRoot = solution.searchBST(root, val);
		System.out.println(detachedRoot);
		solution.printTree(detachedRoot);
	}



}
