import java.util.ArrayDeque;

class Solution {


	//DFS tree tarversal
	public TreeNode insertIntoBST(TreeNode root, int val) {
		
		System.out.println("Current node value: " + root.val);
		if (root == null) {
			
			return new TreeNode(val);
		}	
		
		if (root.val > val) {
			if (root.left == null) {
				TreeNode nodeInserted = new TreeNode(val);
				root.left = nodeInserted;	
				return root;
			}
			insertIntoBST(root.left, val);
		}
		if (root.val < val) {
			if (root.right == null) {
				TreeNode nodeInserted = new TreeNode(val);
				root.right = nodeInserted;	
				return root;
			}
			insertIntoBST(root.right, val);
			
		
		}
		return root;
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
