Problem: Insert into BST (Binary Search Tree)

Solution:

Key idea --> 
	- If node.val > val : val must be inserted in the left subtree of node
	- If node.val < val : val must be inserted in the right subtree of node

We use DFS (recursive) to solve.

	- We explore folowing the BST logic described above. When we encounter a node with null children we insert the value (TreeNode (val)

Time complexity: O(log2n) Thanks to being sorted, we half the tree every iteration. Worst case scenario (skewed tree) O(n)

Space complexity: O(log2n) Worst case scenario (skewed tree) O(n)
