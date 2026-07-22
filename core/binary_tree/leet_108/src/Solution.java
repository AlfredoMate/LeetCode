import java.util.ArrayDeque;

class Solution {

	public TreeNode sortedArrayToBST(int[] nums) {
		return findMiddle(nums, 0, nums.length - 1);
	}

	private TreeNode findMiddle(int[] nums, int left, int right) {
		if (left > right) {
			return null;
		}
		int middle = ((right - left) / 2) + left; 
		TreeNode node = new TreeNode(nums[middle]);
		node.left = findMiddle(nums, left, middle - 1);
		node.right = findMiddle(nums, middle + 1, right);

		return node;
	}

	//Helper method to print the tree in stdout
        public void printTree(TreeNode root) {

		if (root == null) {
			
			System.out.println("Tree is NULL");
			return;
		}		

                ArrayDeque<TreeNode> nodes = new ArrayDeque<>();
                int level = 0;
                nodes.addLast(root);

                while(!nodes.isEmpty()) {

                        int size = nodes.size();
                        System.out.println("--- Level " + level + " ---");

                        for (int i = 0; i < size; i++) {

                                TreeNode currentNode = nodes.poll();
                                System.out.print(currentNode.val + " ");
                                if (currentNode.left != null) {
                                        nodes.addLast(currentNode.left);
                                }
                                if (currentNode.right != null) {
                                        nodes.addLast(currentNode.right);
                                }
                        }
                        level = level + 1;
                        System.out.println();
                }



        }	

}
