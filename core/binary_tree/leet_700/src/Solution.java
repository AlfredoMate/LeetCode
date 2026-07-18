import java.util.ArrayDeque;

class Solution {

	public TreeNode searchBST(TreeNode root, int val) {
		if (root == null) {
			return root;
		} 
		if (root.val == val) {
			return root;
		}
		if (root.val > val) {
			return searchBST(root.left, val);
		}
		if (root.val < val) {
			return searchBST(root.right, val);
		}
		return null;
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
