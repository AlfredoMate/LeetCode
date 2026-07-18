Problem: Diameter of Binary Tree

Solution:

We need class variable to keep track of current max diameter of tree.

Each recursive function on a node has the objective of returning to its caller (parent) the maximum height of that node.

Also, each recursive function will update the current max diameter (class variable). max(current max diameter, leftHeight + rightHeight)

Time complexity: O(n) Process all nodes in the tree

Space complexity:

	- Normal/balanced tree: O(log2n)
	- Worst case (skewed tree) : O(n) height = number of nodes
