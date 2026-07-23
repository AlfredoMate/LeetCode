class Main {
	
	public static void main(String[] args) {
			
		final int k = 9;

		TreeNode root = new TreeNode(5);

		root.left = new TreeNode(3);
		root.right = new TreeNode(6);

		root.left.left = new TreeNode(2);
		root.left.right = new TreeNode(4);

		root.right.right = new TreeNode(7);

		Solution solution = new Solution();
		System.out.println(solution.findTarget(root, k));
	}



}
