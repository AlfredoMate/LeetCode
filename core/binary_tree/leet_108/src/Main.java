class Main {
	
	public static void main(String[] args) {
			

		int[] nums = new int[]{-10,-3,0,5,9};

		Solution solution = new Solution();
		TreeNode newTree = solution.sortedArrayToBST(nums);
		solution.printTree(newTree);
	}



}
