class Main {
	
	public static void main(String[] args) {

		TreeNode node1 = new TreeNode(4);
		TreeNode node2 = new TreeNode(5);
		TreeNode node3 = new TreeNode(2, node1, node2);
		TreeNode node4 = new TreeNode(3);
		TreeNode node5 = new TreeNode(1, node3, node4); //root

		Solution solution = new Solution();
		System.out.println(solution.diameterOfBinaryTree(node5));
	}

}
