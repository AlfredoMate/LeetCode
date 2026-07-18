import java.util.ArrayDeque;

class Main {
	
	public static void main(String[] args) {

		TreeNode node1 = new TreeNode(1);
		TreeNode node2 = new TreeNode(3);
		TreeNode node3 = new TreeNode(6);
		TreeNode node4 = new TreeNode(9);

		TreeNode node5 = new TreeNode(2, node1, node2);
		TreeNode node6 = new TreeNode(7, node3, node4);

		TreeNode root = new TreeNode(4, node5, node6); //root

		Solution solution = new Solution();

		
		System.out.println("Original tree: \n");
		solution.printTree(root);
		TreeNode invertedTree = solution.invertTree(root);
		System.out.println("Inverted tree: \n");
		solution.printTree(invertedTree);
	}



}
