Problem: Search in Binary Search Tree

Solution: 

In a BST tree, left node is smaller than node value and right node is larger than node value.
Recurively we follow the tree either left or right node following that rule.

Time complexity: O(n) In worst case scenario, we visit all nodes

Space complexity: 

	- O(log2 n) In balanced tree.
	- O(n) In worst case, skewed tree
