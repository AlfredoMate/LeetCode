class Main {
	
	public static void main(String[] args) {

		// Test 1
		TreeNode node_1 = new TreeNode(15);
		TreeNode node_2 = new TreeNode(7);
		TreeNode node_3 = new TreeNode(20, node_1, node_2);
		TreeNode node_4 = new TreeNode(9);
		TreeNode node_5 = new TreeNode(3, node_4, node_3); //root
		
		//Test 2
		TreeNode node_6 = new TreeNode(2147483647);
		TreeNode node_7 = new TreeNode(2147483647);
		TreeNode node_8 = new TreeNode(2147483647, node_6, node_7); //root

		Solution solution = new Solution();
		System.out.println(solution.averageOfLevels(node_8)); 
	}
}
