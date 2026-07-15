class Main {
	
	public static void main(String[] args) {

		// Tree 1 (test 1)
		TreeNode node_1 = new TreeNode(2);
		TreeNode node_2 = new TreeNode(3);
		TreeNode node_3 = new TreeNode(1, node_1, node_2); //root
		
		// Tree 2 (test 1)
		TreeNode node_4 = new TreeNode(2);
		TreeNode node_5 = new TreeNode(3);
		TreeNode node_6 = new TreeNode(1, node_5, node_4); //root

		//Tree 1 (test 2)
		TreeNode node_7 = new TreeNode(2);
		TreeNode node_8 = new TreeNode(1, node_7, null); //root
		
		//Tree 2 (test 2)
		TreeNode node_9 = new TreeNode(2);
		TreeNode node_10 = new TreeNode(1, null, node_7); //root

		Solution solution = new Solution();
		System.out.println("Test 1 (true). Output: " + solution.isSameTree(node_3, node_6)); 
		System.out.println("Test 2 (false). Output: " + solution.isSameTree(node_8, node_10)); 
	}
}
