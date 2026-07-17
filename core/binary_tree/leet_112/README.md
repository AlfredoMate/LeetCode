Problem: Target sum binary tree

Solution:

	1. Bases cases
		- node is null: return false
		- node is leaf: return node.val == targetSum

	2. General case
		- return true if either left or right nodes could find a targetSum, else return false

Time complexity: O(n) Visit all nodes

Space complexity: 
	- O(n) Worst case (skewed tree)
	- O(log2 n): Normal case (balanced tree) 

